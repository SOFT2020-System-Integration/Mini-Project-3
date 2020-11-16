package dk.dd.kafkaproducer1.producer;

import org.json.simple.parser.ParseException;

import org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, ParseException, ParserConfigurationException, SAXException {
    MailService ms = new MailService();

    String s = ms.getEmailTemplate();
        System.out.println(s);

    }
}
