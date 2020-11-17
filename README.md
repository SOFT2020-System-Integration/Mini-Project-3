# Mini-Project-3-Message-Oriented-Middleware

###   by Andeas Jørgensen, Jonatan Bakke, Jonas Hein & Thomas  Ebsen
[Assignment Link](A8-MOM.pdf)  
 
## Info
We chose to do nr. 3 in the assignment.  
The program is used to send an Email to all of the clients that is saved in the producers `customers.txt` file
In the customer list is listed a name and an email for each client, and the way the middleware works is, so when you tell the middleware to send an email to all the clients, the content of the email will be generated from the text stored in `Template email.txt`.  

 
## Setup
What you'll need:
1. Apache Kafka - [Download here] ()
2. Kafka Tool 2.0.8 [Download here](https://www.kafkatool.com/download.html)
3. Unzip [Kafka.zip](kafka.zip)
2. Your favorite IDE that can run java, we use IntelliJ.
 
## How to run the project
1. Start Kafka Zookeeper `zookeeper-server-start.bat ../../config/zookeeper.properties`
2. Start Kafka Server `kafka-server-start.bat ../../config/server.properties`
