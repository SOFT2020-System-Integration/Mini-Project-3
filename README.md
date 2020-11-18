# Mini Project-3 Message Oriented Middleware

### by Andeas Jørgensen, Jonatan Bakke, Jonas Hein & Thomas  Ebsen
[Assignment Link](A8-MOM.pdf)  
 
## Info
We chose to do nr. 3 in the assignment.  
The Producer is used to send an Email to all of the people that is saved in the `people.json` file.  
The middleware sends the name of each person in the json file is to a naming-api to determine the title of the person.  
When the title is retrieved, it then injects the title and name into a message that is generated from the content of `TemplateEmail.txt`.
Each message created will then be sent to the respectable person as a message.

The consumer listens for messages sent form the producer, and print's them in it's console.
  
 
## Setup
1. Kafka Tool 2.0.8 [Download here](https://www.kafkatool.com/download.html)
2. Apache Kafka - unzip [Kafka.zip](kafka.zip)
3. In the Kafka folder, navitage to `config` and edit `server.properties` & `zookeeper.properties` to log to your file path (current path is `C:/thoma/documents/kafka/data/kafka or zookeeper` depending on the file open. This path might not work for you.
4. Your favorite IDE that can run java, we use IntelliJ.
5. A tool to send post requests, we use Postman.
 
## How to run the project

####  On Windows
1. Open two command prompts and navigate to `kafka/bin/windows` in both cmd's: (note, if the file path is too long it may not be able to run)
2. Start Kafka Zookeeper (in cmd 1) `zookeeper-server-start.bat ../../config/zookeeper.properties`  
3. Start Kafka Server (in cmd 2) `kafka-server-start.bat ../../config/server.properties`  
4. Start Kafka Tool 2.0.8 and connect to the server:  
![kafka](/img/kafka-setup.png)    
5. Open and run both programs: `Kafka-Producer` and `Kafka-Consumer`  
6. When both programs are running, send a `POST` request to `localhost:9000/kafka/mail/all`
7. You should now be able to see the message sent in both the `Producer` and the `Consumer`'s consoles.
8. The messages sent can also be seen in Kafka 2.0.8. Open the program and navigate to Kafka -> Topics -> `messsage-topic`. Select on the `data` tab and then click on the green circle to see all the messages.
9. If the messages is shown as binary, head to the `properties` tab and change `Content-Types` Key  and Message to `String`.  
![afka](/img/kafkaprogram.png)

#### On Mac
1. Open two command prompts and navigate to `kafka/bin/` in both cmd's:  
2. Start Kafka Zookeeper (in cmd 1) `zookeeper-server-start.sh ../config/zookeeper.properties`
3. Start Kafka Server (in cmd 2) `kafka-server-start.sh ../config/server.properties`
4. Follow step 4-9 in **On Windows**
