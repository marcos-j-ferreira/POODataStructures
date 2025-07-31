#!/bin/bash


set -e

curl https://start.spring.io/starter.zip  \
    -d type=gradle-project  \
    -d language=java   \
    -d bootVersion=3.5.4   \
    -d baseDir=studyJava   \
    -d groupId=com.marcos   \
    -d artifactId=study   \
    -d name=studyJava   \
    -d description=study about POO and struct of date   \
    -d packageName=com.marcos.study   \
    -d packaging=jar   \
    -d javaVersion=17   \
    -d dependencies=devtools   \
    -o studyJava.zip


unzip studyJava.zip
cd studyJava
./gradlew bootRun

