FROM openjdk:8-jre
VOLUME /tmp
ADD web-bazaar-vendors-1.0.0-SNAPSHOT.jar vendors-app.jar
RUN sh -c 'touch /vendor-app.jar'
EXPOSE 8087
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Dapp.port=${app.port}", "-jar","/vendors-app.jar"]
LABEL maintainer "F2T"