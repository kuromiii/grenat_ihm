echo off
cls
title Compiler
javac -d ../class ../src/*.java
pause
javadoc -encoding utf8 -docencoding utf8 -charset utf8 -private -d ../doc ../src/*.java
pause
