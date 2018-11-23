FROM openjdk:8-jre
VOLUME /tmp
ADD web-bazaar-orders-1.0.0-SNAPSHOT.jar orders-app.jar
RUN sh -c 'touch /vendor-app.jar'
EXPOSE 8085
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Dapp.port=${app.port}", "-jar","/orders-app.jar"]
LABEL maintainer "F2T"