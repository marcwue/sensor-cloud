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
FROM adoptopenjdk:15.0.2_7-jre-hotspot
COPY --from=build /home/gradle/build/libs/discoveryserver-0.0.1-SNAPSHOT.jar /usr/local/lib/discoveryserver-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/usr/local/lib/discoveryserver-0.0.1-SNAPSHOT.jar"]