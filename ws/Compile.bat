echo off
cls
title Compiler
javac -d ../class ../src/view/*.java
javac -d ../class ../src/controller/*.java
pause
javadoc -encoding utf8 -docencoding utf8 -charset utf8 -private -d ../doc ../src/controller/*.java
javadoc -encoding utf8 -docencoding utf8 -charset utf8 -private -d ../doc ../src/view/*.java
java view/MainFrame
pause
