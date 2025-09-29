# SPD Semantic

## Introduction & Motivation

This main objective of the the code in this repository is to have
a well-defined semantic for the SPD language.
The semantic is defined in the form of a QVT Operational mapping from PCM to PCM (incl. SPD).

## Prerequisites

* Eclipse Modeling Tools 2021-12
* Java 17
* The following meta-models installed
  * [Palladio Component Model](https://sdqweb.ipd.kit.edu/eclipse/palladiosimulator/updatesite/releases/)
  * [SPD Meta-Model](https://github.com/PalladioSimulator/Palladio-Addons-SPD-Metamodel)
  * [SPD Semantic Meta-Model](https://github.com/PalladioSimulator/Palladio-Addons-SPD-Metamodel)

## Executing the Transformation with the provided Example

The main entry point of the transformation is the `spdtransformation.qvto` script, which can be found
in the folder `spd.semantic.qvto`. 
The transformation can be executed by creating a run configuration for the file and providing the models that 
should be transformed as arguments.


