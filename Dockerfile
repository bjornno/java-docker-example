FROM maven:3.2-jdk-7-onbuild
ADD . /opt/app
WORKDIR /opt/app
RUN mvn clean install
CMD java -cp target/classes:target/dependency/* Server
EXPOSE 8080