# Mini Project-3 Message Oriented Middleware

###   by Andeas Jørgensen, Jonatan Bakke, Jonas Hein & Thomas  Ebsen
[Assignment Link](A8-MOM.pdf)  
 
## Info
We chose to do nr. 3 in the assignment.  
The program is used to send an Email to all of the people that is saved in the `people.json` file
The middleware sends a request to a name api to get the gender of each client and then injects that gender and name into a message that is created from the content of `Template email.txt` and then send that email to all the clients as a message.
  
 
## Setup
What you'll need:
1. Apache Kafka - [Download here] ()
2. Kafka Tool 2.0.8 [Download here](https://www.kafkatool.com/download.html)
3. Unzip [Kafka.zip](kafka.zip)
2. Your favorite IDE that can run java, we use IntelliJ.
 
## How to run the project
1. Start Kafka Zookeeper `zookeeper-server-start.bat ../../config/zookeeper.properties`
2. Start Kafka Server `kafka-server-start.bat ../../config/server.properties`
