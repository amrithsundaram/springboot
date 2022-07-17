![image](https://user-images.githubusercontent.com/79367259/179390035-433a9bab-7318-4478-b447-6679f02286d4.png)

**Application:**

**Programing language:** Java
**Framework:** Java Spring Boot
**Database:** MySQL

This application is used to basic CRUD operation by using Java spring boot.

**CI/CD Tool: Jenkins**

Jenkins is used to automate the continuous Integartion and continuous Deployment.

Stage 1: Pulls the Source code from GIt hub Repo to Jenkins Workspace

Stage 2: Build the Code using Maven Build Tool

Stage 3: Push the Code to SonarQube server for Code analysis and Scan for Vulnerability

Stage 3: The Application is containerized using Docker container runtime engine  

Stage 4: Push the image to Docker hub 

Stage 5: Deploy the application on Kubernetes Cluster as Deployment object


         The spring app and MySQL are deployed as deployment object
         
         
         Config Map is used to pass the host name of the SQL to the Application
         
         
         Kubenetes Secret object is used for storing MySQL username.
         
         
         The Persistent storage is assigned to MySQL using PVC
         
      
      
**Tools used to develop and deploy this application:
**

1.	IntelliJ IDEA: IDE


3.	Spring Initializr: Source to create java spring boot projects


5.	MySql(5.7): Database


7.	Maven(3.8.9): TO build the tool 


9.	Postman(v9. 1.1): To test REST API calls


11.	Jenkins(2.319): CI/CD automation tool


13.	Docker(20.10.7): Containerize the Application


15.	Kubernetes(1.24): Deployment

         
         


