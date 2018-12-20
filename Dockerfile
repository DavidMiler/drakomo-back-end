FROM openjdk:8-jre-alpine

COPY /build/libs/Drakomo-back-end-0.0.1-all.jar /bin/runner/run.jar
WORKDIR /bin/runner

EXPOSE 8080

CMD ["java","-jar", "run.jar"]