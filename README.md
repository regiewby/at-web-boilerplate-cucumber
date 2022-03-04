# at-web-boilerplate-cucumber
at-web-boilerplate-cucumber : Automation Testing Using Java

at-web-boilerplate-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.<br>
it is run on your local PC, and it is open source and free.

## Getting Started
1. Make sure you already install Java SE Development Kit or you can [download here](https://www.oracle.com/java/technologies/downloads/)

## Folder Structure
<br/>The folder structure is as following:

    at-web-boilerplate-cucumber
    │ 
    ├─ features                           # gherkin test cases 
    ├─ src
    │   ├─ test                               # Test files
    │         ├─ pages                         # Page Object Factory
    │         ├─ runners                       # TestNg Runner
    │         ├─ steps                         # Step Definitions
    │   ├─ main 
    │         ├─ factories                     # implement design pattern factory for init an objects
    │         └─ utilities                     # utility
    ├─ README.md
    ├─ pom.xml
    ├─ testng.xml
    └─ ...   
    

## How to Run
1. Choose browser type on 'src/test/resources/run-config.properties'
2. Using Maven CLI
````
mvn test
````
<li> or you can do right click on testng.xml file and click 'Run .../testng.xml' if you're using IntelliJ IDEA

## Reporting
I'm using extentreport for reporting, <br>
and file report will be generated on directory 'target/reports',

