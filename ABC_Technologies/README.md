# abctechnologies code
## assignment1
This project works is a part of industry grade project moudle in Edureka PG program.

Description: A simple java based project. 

It is executed on Ubuntu server version 18.04.3 LTS (Bionic Beaver)

### Learnings
1. Set-up git repository
2. Maven build, creating war file.
3. Setting up tomcat server to deploy war file, accessing tomcat on different port and setting different users.
4. Jenkins CI/CD pipeline to execute jobs to perform different stages like
   1. Git checkout 
   2. package
   3. Docker Build and Tag
   4. Login to DockerHub account
   5. Publishing image on DockerHub
   6. Run Docker container on Jenkins Agent
5. Docker
   1. Writing Dockerfile to create an image for the application
6. Kubernetes
   1. Creating Kubernetes cluster to deploy web application
   2. Writing manifest for Deployment and Service
7. Used Helm chart to deploy application on Kubernetes
8. Monitoring
   1. Monitoring Kubernetes cluster using Prometheus and Grafana