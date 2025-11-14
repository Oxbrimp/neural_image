#!/bin/bash

JFX_PATH=~/javafx/javafx-sdk-21/lib

echo "Compiling Java files..."
javac --module-path $JFX_PATH --add-modules javafx.controls MNISTViewer.java Main.java

echo "Running MNIST viewer..."
java --module-path $JFX_PATH --add-modules javafx.controls Main

java --module-path $JFX_PATH --add-modules javafx.controls Main 2>/dev/null
