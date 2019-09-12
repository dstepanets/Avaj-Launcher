#!/bin/sh

find . -name "*.java" > sources.txt
javac -sourcepath . @sources.txt
java -cp src ua.unit.avaj.Simulator scenario.txt
