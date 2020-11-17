# Mini Project-3 Message Oriented Middleware

###   by Andeas Jørgensen, Jonatan Bakke, Jonas Hein & Thomas  Ebsen
[Assignment Link](A8-MOM.pdf)  
 
## Info
We chose to do nr. 3 in the assignment.  
The program is used to send an Email to all of the people that is saved in the `people.json` file.  
The middleware sends the name of each person in the json file is to a naming-api to determine the title of the person.  
When the title is retrieved, it then injects the title and name into a message that is generated from the content of `TemplateEmail.txt`.
Each message created will then be sent to the respectable person as a message.
  
 
## Setup
1. Kafka Tool 2.0.8 [Download here](https://www.kafkatool.com/download.html)
2. Apache Kafka - unzip [Kafka.zip](kafka.zip)
2. Your favorite IDE that can run java, we use IntelliJ.
 
## How to run the project
1. Go to the root of your unzipped Kafka folder, and then do the following:  
- [b]Windows

1. Start Kafka Zookeeper `zookeeper-server-start.bat ../../config/zookeeper.properties`
2. Start Kafka Server `kafka-server-start.bat ../../config/server.properties`
