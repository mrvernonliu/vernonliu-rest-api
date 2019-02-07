**Instruction for running the stack locally (ie without docker-compose):**
1. Build the project on intelliJ
2. ./gradlew bootJar (This will create a jar file)
3. docker build -t mrvernonliu/vernonliu-rest-api:test .
4. docker run -p 8080:8080 -e DATABASE_HOST=\<HOSTNAME\> -e DATABASE_NAME=\<NAME\> -e DATABASE_PORT=\<PORT\> -e ADMIN_USERNAME=\<ADMIN_USERNAME\> -e ADMIN_PASSWORD=\<PASSWORD\> mrvernonliu/vernonliu-rest-api:test

##Pushing to the docker repo
docker push mrvernonliu/vernonliu-rest-api:latest
