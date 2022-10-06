# customer-assign

// conf.json 
project folder structure 

-o "project name"

-i "openapi.yaml"
yaml file for rest-end generator.

-g "spring"
type of project.

step -1
java -jar openapi-generator-cli-4.3.1.jar generate -g spring -i openapi.yaml -c conf.json -o customassign-proj

step -2
mvn clean install

step 3
mvn spring-boot:run


