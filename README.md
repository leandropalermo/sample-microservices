# Sample-microservices

================================================================================================

### Introduction

   A sample microservice using spring-boot and spring-cloud. 
   
   In this project there are four applications: 

- EurekaApplication. This application is the Server Discovery of this sample microservice, which all the other 
applications are going to connect with. The path to connect with the server is "http://localhost:8011"

- CloudConfigApplication. This application is the  Server Configuration, it is connected with a Github project, 
which contains configuration file from the other application servers.

- App1Application - This application has a controller that returns a simple response, whose values are 
in its application.yml file.

- App2Aplication - This application has a controller which by feign call the App1Application controller and returns
its response.

This program was created hoping that it can explain how to create a microservice using Java, Spring Boot and 
Spring Cloud Netflix. There are a lot of other tools that could be used to create or to improve this program, but that
is not the goal. The goal is to show how to create a basic microservice for those who want to learn 
how to develope a simple microservice.

================================================================================================

### Prerequisites

Required software components to run the program:

- MVN (Apache Maven)
- JDK 8 (Java Development Kit version 8)

================================================================================================

### Building

##### Install the softwares prerequired.

   - Install the JDK 8 and MVN correctly and set the required environment variables of both softwares.

##### Build the application

   - Inside the "samplemicroservice" folder has a .pom file. Get into this folder and type the command 'mvn clear install".
     
   - This is a maven command that make the maven download all the library necessary to run the program (you need to be 
    connected on the internet in order to work).
    
   - After successfully executing the mvn command, it should have created a folder named "target" in every application. 
        Inside the folder there will be a ".jar" file.
    
##### Expected Output
    
>   [INFO] sample-microservice 1.0-SNAPSHOT ......... SUCCESS 
> 
>   [INFO] microservice-configuration ........................ SUCCESS 
>    
>   [INFO] eureka-server ............................................ SUCCESS 
>    
>   [INFO] app1 .......................................................... SUCCESS 
>    
>   [INFO] app2 1.0-SNAPSHOT .................................. SUCCESS 
>    
>   [INFO] -------------------------------------------------------------------------
>    
>   [INFO] BUILD SUCCESS
>    
>   [INFO] -------------------------------------------------------------------------
    

================================================================================================

### Running the applicatin
   
   To run the application, type the command "java -jar <jar's file name>". To not occur any error, execute the command in this order:
   
   - EurekaApplication
   - CloudConfigApplication
   - App1Application
   - App2Application
    
================================================================================================

### Authors
   
   - Leandro Palermo

    