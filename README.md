# Graph NLU

![Preview Image](/notebooks/screenshots/qa2-multiple-list.png)

## Motivation :bar_chart:

Graph NLU uses graph databases as a means to represent natural language relationships flexibly and dynamically.

The primary motivation for this project is to develop a way to understand natural language dialog in an interactive setting by remembering previous dialog states. [Virtual assistants](https://en.wikipedia.org/wiki/Virtual_assistant_(artificial_intelligence)) like Siri, Google Assistant, and Alexa have the common problem that they behave like amnesiacs, i.e., they do not remember much about previous interactions.

One proposal to get around the memory problem is by representing the previous dialog states using a persistent graph. Because graphs offer a powerful and interpretable way of encoding high-level representations of entities and their associated relationships, an attractive proposition is to leverage them in processing natural language. Graph databases (e.g., [Neo4j](https://neo4j.com/)) offer a rich suite of tools to quickly construct such graphs and persist them over the long term.

This project is in its research phase, hence all code in this repository is exploratory. The supplied Jupyter (iPython) notebooks do the following:

1. Examine several dialog domains
1. Explain some of the design considerations for using graphs to process natural language
1. Define models for solving a dialog domain
1. Evaluate these models for accuracy and usefulness

Explanations behind each code snippet are given where possible. [Read the research paper (PDF)](docs/IPA_Memory_Dan_Kondratyuk_2017.04.30.pdf) discussing a more detailed approach to the personal assistant memory problem.

## Getting Started :traffic_light:

- [Video talk overview (YouTube)](https://www.youtube.com/watch?v=mTCqQ2e08Q8)
- [Video talk slides (PDF)](docs/Graph%20NLU-%20Natural%20Language%20Understanding%20with%20Python%20and%20Neo4j.pdf)

Get an introduction to this project by viewing the supplied Jupyter notebooks in GitHub under the `notebooks` directory:

- [dynamic_memory_1](notebooks/dynamic_memory_1.ipynb) - Evaluates the bAbI QA tasks using Neo4j queries

## Running the Code :snake:

The Python code uses the Neo4j graph database to store and query natural language relationships. In addition, several processing steps will require popular Python data processing tools like `pandas`, `numpy`, `sklearn`, and `nltk`.

### Prerequisites

1. Make sure these are on your system:
- [Python](https://www.python.org/downloads/) (3.5+)
- [Neo4j](https://neo4j.com/download/community-edition/) (3.1+)

1. Install the python packages in `requirements.txt` if you don't have them already.

```bash
pip install -r ./requirements.txt
```

### Running Jupyter Notebooks

1. Clone the repository.

```bash
git clone https://github.com/Hyperparticle/graph-nlu.git
cd ./graph-nlu/notebooks
```

1. Run the iPython notebooks with Jupyter.

```bash
jupyter notebook
```

1. Get an introduction to the project with [dynamic_memory_1](notebooks/dynamic_memory_1.ipynb).

## Contributing :mega:

Interested in the project? We'd love to hear your ideas! Open a [GitHub issue](https://github.com/Hyperparticle/graph-nlu/issues) with your comments.

## About :clipboard:

Created by [Dan Kondratyuk](https://hyperparticle.com/about/), a member of [Speech, Language & Interactive Machines (SLIM)](http://coen.boisestate.edu/slim/) at Boise State University.
