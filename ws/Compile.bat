echo off
cls
title Compiler
javac -d ../class ../src/view/*.java
javac -d ../class ../src/controller/*.java
javac -d ../class ../src/model/*.java
pause
javadoc -encoding utf8 -docencoding utf8 -charset utf8 -private -d ../doc ../src/controller/*.java
javadoc -encoding utf8 -docencoding utf8 -charset utf8 -private -d ../doc ../src/view/*.java
javadoc -encoding utf8 -docencoding utf8 -charset utf8 -private -d ../doc ../src/model/*.java
pause
