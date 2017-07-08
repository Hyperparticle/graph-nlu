# Graph NLU

The primary motivation for this project is to develop a way to understand natural language dialogue in an interactive setting by representing memory of previous dialogue states using a persistent graph. Because graphs offer a powerful and interpretable way of endcoding high-level representations of entities and their associated relationships, an attractive proposition is to leverage them in processing natural language. Graph databases (e.g., Neo4j) offer a rich suite of tools to quickly construct and test such graphs and persist them over the long term, and hence will be primary focus of this project.

This project is in its research phase, hence all code in this repository is exploratory. The supplied iPython notebooks examine several dialogue domains, explain some of the design considerations for using graphs to process natural language,   and evaluate these models for accuracy. Explanations behind each code snippet are given where possible.

## Getting Started

Get an introduction to this project by viewing the supplied Jupyter notebooks online under the `notebooks` directory. See [dynamic_memory_1](notebooks/dynamic_memory_1.ipynb) on GitHub to get started.

## Running the Code

### Prerequisites

1. Make sure these are on your system:
- [Python](https://www.python.org/downloads/) (3.5+)
- [Neo4j](https://neo4j.com/download/) (3.1+)

2. Install the python packages in `requirements.txt` if you don't have them already.

```
pip install -r ./requirements.txt
```

### Running Jupyter Notebooks

1. Clone the repository.
```
git clone https://github.com/Hyperparticle/graph-nlu.git
cd ./graph-nlu/notebooks
```

2. Run the iPython notebooks with Jupyter.
```
jupyter notebook
```

3. Get and introduction to the project with [dynamic_memory_1](notebooks/dynamic_memory_1.ipynb).

## About

Created by Dan Kondratyuk, a member of [Speech, Language & Interactive Machines (SLIM)](http://coen.boisestate.edu/slim/) at Boise State University.
