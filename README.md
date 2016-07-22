# ErRabbit-logback-apeender

Slf4j 1.x Custom appender for ErRabbit

ErRabbit URL : https://github.com/soleaf/ErRabbit

#### Maven

```xml
<dependency>
    <groupId>org.mintcode.errabbit</groupId>
    <artifactId>slf4j-apeender</artifactId>
    <version>1.0.0</version>
</dependency>
```

#### Setup log4j.xml

1. Declare 'errabbit' appender to `logback.xml` with your ActiveMQ URL, userName, password, rabbitID

 
```xml
<?xml version="1.0" encoding="UTF-8"?>

<configuration>

      <appender name="errabbit" class="org.mintcode.errabbit.logback.LogbackAppender">
        <param name="host" value="tcp://localhost:61616"/>
        <param name="rabbitID" value="test"/>
        <pattern>%-4relative [%thread] %-5level %logger{35} - %msg %n</pattern>
    </appender>

    <root level="DEBUG">
        <appender-ref ref="errabbit" />
    </root>

</configuration>
```

CustomAppender's source : https://github.com/plinioasf/ErRabbit-logback-apeender

#### Use In Application Code

You can collect all kind of log(info, debug, trace .. etc). But, for your application performance,
use only as exception error logging.

1. Get Slf4j Logger
 
```java
Logger logger = LoggerFactory.getLogger(getClass());
```

1. Log error with exception, Just type `logger.error([message],e)`

```java
try{
    int a[] = new int[2];
    System.out.println("Access element three :" + a[3]);
}
catch (Exception e){
    logger.error(e.getMessage(),e);
}
```

Example Project : https://github.com/plinioasf/ErRabbit-Example-logback


