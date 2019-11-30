# Media Finder
  
Image manager is an application which allows you to manage(view/delete) images present in a cacaoo application can be found at

More info about cacoo application can be found at https://nulab.com/products/cacoo/

# How to use this application ?
1. Hit the below url to open an ui which will allow you to view list of all the images in cacoo application.
  http://localhost:4200/    
2. Currently this application retrives images present from my(sayali kotkar) account.
3. If you want to display images from any other account, generate the api key as mentioned in below link  and  replace it in application.yml file
https://developer.nulab.com/docs/cacoo/auth/#authentication-authorization

# Technology Stack:
  * Java 1.8
  * Spring Boot, Spring Actuator
  * Swagger UI

# Prerequisites:
  * Install Java 8
  * Install Maven build tool

# How to setup this application locally ?
  1. Clone the repository from command line using below command
      git clone https://github.com/sayali-kotkar/media-finder.git).
  2. Run mvn spring-boot:run command from the project folder using command prompt/terminal.
  
# Swagger UI Url:
  * http://localhost:8080/swagger-ui.html
  
# Application Metrics

Basic application metrix can be  accessed using Actuator URLs

http://localhost:8080/actuator/health

http://localhost:8080/actuator/info

http://localhost:8080/actuator/metrics

http://localhost:8080/actuator/trace

Spring Boot Actuator provides dependency management and auto-configuration for Micrometer, an application metrics facade that supports numerous monitoring systems, including:

.AppOptics
.Atlas
.Datadog
.Dynatrace
.Elastic
.JMX 
