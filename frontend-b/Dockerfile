FROM gradle:5.4.1-jre11-slim as builder
COPY --chown=gradle:gradle . /home/gradle/webapp
WORKDIR /home/gradle/webapp
RUN gradle clean test bootJar

FROM azul/zulu-openjdk-alpine:11.0.3
COPY --from=builder /home/gradle/webapp/build/libs/frontend.jar frontend.jar

ENTRYPOINT ["java", "-jar", "frontend.jar"]