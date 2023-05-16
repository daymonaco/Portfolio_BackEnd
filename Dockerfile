FROM amazoncorretto:11-alpine-jdk
MAINTAINER DM
COPY target/dmnc-0.0.1-SNAPSHOT.jar dmnc-app-jar
ENTRYPOINT ["java,"-jar,"/dmnc-app-jar"]
