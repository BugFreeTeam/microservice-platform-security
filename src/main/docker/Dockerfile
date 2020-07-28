FROM java:8
VOLUME /tmp
ADD microservice-platform-security-0.0.1-SNAPSHOT.jar microservice-platform-security.jar
RUN bash -c 'touch /microservice-platform-security.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/microservice-platform-security.jar"]