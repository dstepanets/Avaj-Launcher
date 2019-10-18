# Avaj-Launcher

Simple aircraft logistics simulation program. Based on the provided UML class diagram.

![](doc/avaj_uml.jpg)

## Description

This project is intended to teach a student: 
- the basics of Java development
- interpreting UML class diagrams
- implementing object-oriented design patterns
- working with files
- error management
- and more

The program takes a scenario file. It lists aircraft and their started coordinates. The first line is the number of simulation runs. Each run, the Weather Tower provides updated weather conditions for every aircraft and its coordinates. And aircraft react with changing coordinates by specified step and logging a message to the simulation file, the message corresponds to the weather. If the height of an aircraft reaches 0, it lands and unregisters from the Tower, thus stopping its participation.

*This is the first project of the Java branch at School 42.*

**Detailed description of the task: [avaj-launcher.en.pdf](https://github.com/dstepanets/Avaj-Launcher/blob/master/doc/avaj-launcher.en.pdf)**

## Usage

Compile and run the program with the script **RUN.sh**. A program takes a path to a scenario file as a single parameter. By default, it looks for *scenario.txt* in the *src* dir. 

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
25
Baloon B1 2 3 20
Baloon B2 1 8 66
JetPlane J1 23 44 32
Helicopter H1 654 33 20
Helicopter H2 22 33 44
Helicopter H3 98 68 99
Baloon B3 102 22 34
JetPlane J2 11 99 768
Helicopter H4 223 23 54
```

From this input, the program generated this simulation log file: [simulation.txt](https://github.com/dstepanets/Avaj-Launcher/blob/master/src/simulation.txt).
