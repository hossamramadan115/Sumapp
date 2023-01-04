FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp/src
RUN javac App.java
CMD ["java", "App"]