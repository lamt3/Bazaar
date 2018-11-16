FROM openjdk:8-jre
VOLUME /tmp
ADD restaurants-app-1.0.0-SNAPSHOT.jar restaurants-app.jar
RUN sh -c 'touch /restaurants-app.jar'
EXPOSE 8083
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Dapp.port=${app.port}", "-jar","/restaurants-app.jar"]
LABEL maintainer "F2T"