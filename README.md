# Avaj-Launcher

Simple aircraft logistics simulation. Based on the provided UML class diagram.

![](doc/avaj_uml.jpg)

## Description

This project is intended to teach a student: 
- the basics of Java development
- interpreting UML class diagrams
- implementing object-oriented design patterns
- working with files
- error management
- and more

The program takes a scenario file. And generates a simulation log.

```
SCENARIO INPUT FILE FORMAT:
A) First line:
	<PositiveInt>
	(NumberOfSimulationsToRun)
B) All following lines - list of participating aircrafts in format:
	<String> <String> <PositiveInt> <PositiveInt> <PositiveInt>
	(Type) (Name) (Longitude) (Latitude) (Height)
  
* 3 types of aircraft are available: Helicopter, JetPlane, Baloon.
* Empty lines are ignored.
  ```

For example:

```

```



*This is the first project of the Java branch at School 42.*

**Detailed description of the task: [avaj-launcher.en.pdf](https://github.com/dstepanets/Avaj-Launcher/blob/master/doc/avaj-launcher.en.pdf)**

