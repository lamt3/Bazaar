FROM openjdk:8-jre
VOLUME /tmp
ADD web-bazaar-marketplace-1.0.0-SNAPSHOT.jar marketplace-app.jar
RUN sh -c 'touch /vendor-app.jar'
EXPOSE 8086
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Dapp.port=${app.port}", "-jar","/marketplace-app.jar"]
LABEL maintainer "F2T"