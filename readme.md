# Lunatech Spring Workshop #

## Tasks ##
+ Get in touch with the basics of the framework
+ Complete asigned task to understand better how to implement an application using this technology

## Technologies ##
The tech stack used to build this application is:
+ Implementation with: **Spring Framework**
+ Database: **H2 In Memory Database**

## Requirements ##
+ JDK 11 installed on your machine
+ IntelliJ Ultimate (desired). The Community version doesn't have support for Spring Framework. 
+ Maven (usually included within your IDE)

But you can use the IDE of your preference.

## Configure your IDE to have support for Spring applications ##
In your IntelliJ, follow the next steps:

### Plugins ###
In the case that you have already enabled the support for Spring Framework, you only will need to add the Lombok plugin.
The plugins related to spring will be enabled by default.
Add or enable this plugins:
+ Lombok
+ Spring AOP/@AspectJ
+ Spring Boot
+ Spring Data
+ Spring MVC
+ Spring Security
+ Spring Support

### Configuration ###
We need to go to the Preferences | Build, Execution, Deployment | Compiler | Annotation Processors and make sure of the following:

Enable annotation processing box is checked

Obtain processors from project classpath option is selected


Once we completed this steps, restart your IDE.

## Building ##

The simplest way of building the app is using maven.
To build this application by console you can run:

```bash
mvn clean package
```

Then, you can verify that there is a new jar artifact in:
```
$project_dir/target/demo-0.0.1-SNAPSHOT.jar
```

This artifact includes all the dependencies to run as a standalone application.

Also, you can use the Maven extension integrated in your IDE to clean and package the application.

## Execution ##
Requirements:
- Java Runtime Environment(JRE) 11 installed on the machine.
    ### Instructions ###
    1. Configure application.properties
    2. Open a new console and navigate to the project's Path.
    3. Run the command:
        ```
        java -jar demo-0.0.1-SNAPSHOT.jar
        ```
    ### Test ###
    1. Open the next link to use the application: http://localhost:8080/

Within the IDE, you can run the application using the Run/Debug Configurations provided by IntelliJ.
