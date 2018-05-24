## Demo Eureka Server

By default, this example starts up an Eureka Standalone Server listening in port 8010 -> https://localhost:8010/eureka

You can run 3 intercommunicating instances instead running 3 separate commands:
* java -jar -Dspring.profiles.active=primary eureka-server-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=secondary eureka-server-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=tertiary eureka-server-0.0.1-SNAPSHOT.jar

being the URL's
* http://eureka-primary:8011/eureka/
* http://eureka-secondary:8012/eureka/
* http://eureka-tertiary:8013/eureka/
