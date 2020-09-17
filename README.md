# Home Automation Kata

# Aufgabe 1
Refactor this code to make it easier to implement new switches and/or add new home-automation components.

First, find out which of the SOLID-principles were violated. Refactor the existing code. Make sure the program still
behaves the same way after your refactoring. There's a unit test in place that checks that on a very rudimentary level
by just looking at the output of the program.

# Aufgabe 2
When you're done refactoring, test the quality of your refactoring by implementing new stuff:

Implement two additional switches:
* MotionDetector to switch on lights in the staircase
* QuickBreakfastSwitch to just raise the blinds and make coffee

Implement an additional component:
* An automatic vacuum cleaner. It should start the cleaning once everything else is turned off.

Evaluate whether or not your refactoring made life easier for you, or not.

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/modernSE/kata-home-automation-java)
