# jenkins-tutorial
> https://casualdevelopers.com/?s=jenkins

## SetUp
```bash
# start containers
$ docker-compose up --build -d

# tail log
$ docker-compose logs -f jenkins
Attaching to jenkins-tutorial_jenkins_1
jenkins_1  | *************************************************************
jenkins_1  | 
jenkins_1  | Jenkins initial setup is required. An admin user has been created and a password generated.
jenkins_1  | Please use the following password to proceed to installation:
jenkins_1  | 
jenkins_1  | xxxxxxxxxxxxxxxxxxxxxxxxx
jenkins_1  | 
jenkins_1  | This may also be found at: /var/jenkins_home/secrets/initialAdminPassword
```
