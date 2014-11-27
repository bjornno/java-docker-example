FROM jamesdbloom/docker-java7-maven
ADD . /opt/app
WORKDIR /opt/app
RUN mvn clean install
COMMAND java -cp target/classes:target/dependency/* Main
EXPOSE 8080