**Instruction for running the stack locally (ie without docker-compose):**
1. Build the project on intelliJ
2. ./gradlew bootJar (This will create a jar file)
3. docker build -t mrvernonliu/vernonliu-rest-api:test .
4. docker run -p 8080:8080 -e DATABASE_HOST=localhost -e DATABASE_NAME=vernonliucom -e DATABASE_PORT=3306 -e ADMIN_USERNAME=admin -e ADMIN_PASSWORD=password mrvernonliu/vernonliu-rest-api:test
doc
##Pushing to the docker repo
docker push mrvernonliu/vernonliu-rest-api:latest