FROM eclipse-temurin:17-jre
WORKDIR /storyTellingV2
COPY target/maven-jar-plugin-1.0.5.jar .
CMD ["java", "-jar", "maven-jar-plugin-1.0.5.jar"]