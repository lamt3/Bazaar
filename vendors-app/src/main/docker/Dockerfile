FROM openjdk:8-jre
VOLUME /tmp
ADD vendors-app-1.0.0-SNAPSHOT.jar vendor-app.jar
RUN sh -c 'touch /vendor-app.jar'
EXPOSE 8082
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Dapp.port=${app.port}", "-jar","/vendor-app.jar"]
LABEL maintainer "F2T"