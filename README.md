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

Running all services:
* java -jar /home/raularroyo/sts-bundle/workspace-sts/MicroservicesWithSpring/lab-8/config-server-solution/target/lab-8-config-server-solution-1.jar
* java -jar /home/raularroyo/sts-bundle/workspace-sts/eureka-server/target/eureka-server-1.jar
* java -jar -Dspring.profiles.active=subject /home/raularroyo/sts-bundle/workspace-sts/eureka-client/target/eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=adjective /home/raularroyo/sts-bundle/workspace-sts/eureka-client/target/eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=noun /home/raularroyo/sts-bundle/workspace-sts/eureka-client/target/eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=article /home/raularroyo/sts-bundle/workspace-sts/eureka-client/target/eureka-client-0.0.1-SNAPSHOT.jar
* java -jar -Dspring.profiles.active=verb /home/raularroyo/sts-bundle/workspace-sts/eureka-client/target/eureka-client-0.0.1-SNAPSHOT.jar
