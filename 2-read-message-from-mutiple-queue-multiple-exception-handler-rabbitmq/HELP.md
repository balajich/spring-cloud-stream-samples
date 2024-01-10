# Getting Started
- Simple application to read messages from multiple Rabbit MQ queue.
- Queue name are myQueue1 ,myQueue2
- if an exception occurred while processing the message, the message will be moved to the designated dead letter queue.
- Dead letter queue name is myQueue1.myGroup1.dlq ,myQueue2.myGroup2.dlq respectively.


# Prerequisites
set JAVA_HOME=C:\soft\jdk-21.0.1
set GRADLE_HOME=C:\soft\gradle-8.4
set PATH=%JAVA_HOME%\bin;%GRADLE_HOME%\bin;%PATH%
# Running Rabbit MQ in docker container (Message Bus)
- start the rabbitmq docker container
- docker-compose up -d
- stop and remove the containers
- docker-compose  down
# Rabbit MQ UI
- Access the admin page http://localhost:15672/
- username: guest and password: guest