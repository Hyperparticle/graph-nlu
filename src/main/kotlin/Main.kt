import edu.stanford.nlp.dcoref.CorefCoreAnnotations.CorefChainAnnotation
import edu.stanford.nlp.ling.CoreAnnotations.*
import edu.stanford.nlp.pipeline.Annotation
import edu.stanford.nlp.pipeline.StanfordCoreNLP
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation
import edu.stanford.nlp.trees.TreeCoreAnnotations.TreeAnnotation
import java.io.File
import java.util.*

/**
 * Main program entry point.
 *
 * Created on 4/3/2017
 * @author Dan Kondratyuk
 */
fun main(args: Array<String>) {
// creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution
    val props = Properties()
//    props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref")
    props.put("annotators", "tokenize, ssplit, pos")
    val pipeline = StanfordCoreNLP(props)

    // read some text from the file..
    val inputFile = File("src/main/resources/qa1_single-supporting-fact_train.txt")
    val text = inputFile.readText()

    // create an empty Annotation just with the given text
    val document = Annotation(text)

    // run all Annotators on this text
    pipeline.annotate(document)

    // these are all the sentences in this document
    // a CoreMap is essentially a Map that uses class objects as keys and has values with custom types
    val sentences = document.get(SentencesAnnotation::class.java)

    for (sentence in sentences) {
        // traversing the words in the current sentence
        // a CoreLabel is a CoreMap with additional token-specific methods
        for (token in sentence.get(TokensAnnotation::class.java)) {
            // this is the text of the token
            val word = token.get(TextAnnotation::class.java)
            // this is the POS tag of the token
            val pos = token.get(PartOfSpeechAnnotation::class.java)
            // this is the NER label of the token
//            val ne = token.get(NamedEntityTagAnnotation::class.java)

//            println("word: $word pos: $pos ne:$ne")

            println("word: $word pos: $pos")
        }

        // this is the parse tree of the current sentence
        val tree = sentence.get(TreeAnnotation::class.java)
        println("parse tree:\n" + tree)

        // this is the Stanford dependency graph of the current sentence
        val dependencies = sentence.get(CollapsedCCProcessedDependenciesAnnotation::class.java)
        println("dependency graph:\n" + dependencies)

        return
    }

    // This is the coreference link graph
    // Each chain stores a set of mentions that link to each other,
    // along with a method for getting the most representative mention
    // Both sentence and token offsets start at 1!
    val graph = document.get(CorefChainAnnotation::class.java)

    println(graph)
}
