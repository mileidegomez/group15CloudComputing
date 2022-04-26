FROM java:8
ADD target/springboot2-mongodb-jpa-hibernate-crud-example-0.0.1-SNAPSHOT.jar gameManagement.jar
EXPOSE 8080
RUN mkdir /home/temp-files
CMD java -jar gameManagement.jar