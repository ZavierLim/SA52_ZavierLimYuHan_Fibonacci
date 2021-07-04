# SA52_ZavierLim_Fibonacci
 
SA52_ZavierLim_fibonacci

Challenge 1:
1. Run the project and go to page localhost:8080/fibonacci and send the json object as the response body: { "elements": 10 }

Results: {"fibonacci":[0,1,1,2,3,5,8,13,21,34],"sorted":[34,8,2,0,21,13,5,3,1,1]}

Challenge 2: How to Run Project Docker:

1. In Spring Tool Suite, generate the jar file in the target folder by running as maven install.
2. In CMD, cd to the file of the project where the pom.xml file is located.
3. Run command - docker build -t target/fibonacci-docker.jar . This will build the file in docker.
4. Run command docker run -p8080:8080 --name testing -d target/fibonacci-docker.jar
5. Go to localhost:8080/fibonacci and send the Json object : { "elements": 10 }

Results: {"fibonacci":[0,1,1,2,3,5,8,13,21,34],"sorted":[34,8,2,0,21,13,5,3,1,1]}
