echo off
cls
title Compiler
REM color 0A
javac -d ../class ../src/*.java
pause
javadoc -encoding utf8 -docencoding utf8 -charset utf8 -private -d ../doc ../src/*.java
java TestTableau
pause
