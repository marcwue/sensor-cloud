#
# Build stage
#
FROM gradle:6.7.1-jdk15 AS build
COPY --chown=gradle:gradle . /home/gradle
WORKDIR /home/gradle
RUN gradle build

#
# Package stage
#
FROM arm32v7/adoptopenjdk:15.0.2_7-jre-hotspot
COPY --from=build /home/gradle/build/libs/sensorservice-0.0.1-SNAPSHOT.jar /usr/local/lib/sensorservice-0.0.1-SNAPSHOT.jar
EXPOSE 8200
ENTRYPOINT ["java", "-jar", "/usr/local/lib/sensorservice-0.0.1-SNAPSHOT.jar"]