#!/bin/bash

echo "Running bash script"



buildProject()
  {
    mvn clean
    mvn dependency:copy-dependencies
    mvn install
    java -jar target/ivq-1.jar
  }


runTests()
  {
    mvn clean
    mvn test
  }

$@
