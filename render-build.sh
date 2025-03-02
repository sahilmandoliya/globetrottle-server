#!/usr/bin/env bash
curl -fsSL https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.tar.gz | tar xz
export JAVA_HOME=$PWD/jdk-21
export PATH=$JAVA_HOME/bin:$PATH
./mvnw clean package -DskipTests
