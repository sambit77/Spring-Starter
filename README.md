This file can be used as a template for initializing and running spring projects.

What's included: 
1. Gradle file created from start.spring.io
2. Plugins for Spotbugs, Checkstyle and Jacoco included (Disabled : to enable add `id 'checkstyle'` to build.gradle) 
3. Other dependencies like Mongo, MySql and redis.
4. Dockerfile to start mongo server and run the spring boot application within.

Usage - 

1. To build the repository - 

From the repository root, 

1. run `./gradlew build test`run the build
2. run `./gradlew bootjar` to create executable jar. The jar will be located inside build directories.
3. run `./gradlew bootrun` to directly start the spring boot application accessible on (`http://localhost:8081/say-hello?messageId=001`)

To run inside docker container, use below commands

To build docker image, use the command below - `docker build -t your_tag_name  .`

To run the generated container, use this command - `docker run -p8080:8080 your_tag_name`. This will run the server on 8080 port.. You can change the ports as per your needs. 


-----------------------------------------------------------------------------------

Follow below steps to use this repository as a starter stub for a new spring-boot project

1. Create a new repository `demo-project`
2. set up a new project locally on your workspace `mkdir demo-project && cd demo-project`
3. `echo " " >> README.md`
4. `git init`
5. `git add README.md`
6. `git commit -m "first commit"`
7. `git branch -M main`
8. `git remote add origin <repo-url-demo-project>`
9. `git push -u origin main`
10. Downloading `Spring-Starter` as a stub for your current project 
11. `git remote add starter-stub https://github.com/sambit77/Spring-Starter.git`
12. `git config pull.rebase false`
13. `git pull starter-stub main --allow-unrelated-histories --no-edit`
14. Manually resolve merge conflict on README.md file from UI
15. `git add .`
16. `git commit -m "starter stub added"`
17. `git push -u origin main`

Ensure a working codebase:- 

1. Depedencises : Mongodb , java jdk 
2. Verify mongo connectivity by pushing sample data to mongodb `./start.sh`
3. Run Spring Application `chmod +x ./gradlew` and then `./gradlew bootrun`
4. Check working of rest api from another terminal `curl "http://localhost:8081/say-hello?messageId=001"` , Sample Output `{"message":"Hello world"}`
5. Test for working testcases `./gradlew test`


    
