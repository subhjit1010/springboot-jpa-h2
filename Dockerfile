FROM openjdk:8
EXPOSE 8080
ADD target/springboot-jpa-h2-image.jar springboot-jpa-h2-image.jar
ENTRYPOINT ["java","-jar","/springboot-jpa-h2-image.jar"]