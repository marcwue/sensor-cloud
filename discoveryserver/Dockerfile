#
# Build stage
#
FROM gradle:6.7.1-jdk15 AS build
COPY --chown=gradle:gradle . /home/gradle
WORKDIR /home/gradle
RUN gradle build --no-daemon

#
# Package stage
#
FROM openjdk:15-jdk-alpine
COPY --from=build /home/gradle/build/libs/discoveryserver-0.0.1-SNAPSHOT.jar /usr/local/lib/discoveryserver-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/usr/local/lib/discoveryserver-0.0.1-SNAPSHOT.jar"]