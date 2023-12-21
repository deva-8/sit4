// import org.classes.Employee;
// import org.parser.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException, XMLStreamException, SAXException, ParserConfigurationException {

        Rabotniki rabotniki = new Rabotniki();

        List<Rabotniki> employees = new ArrayList<Rabotniki>();
        employees.add(rabotniki);

        XMLwriter agent = new XMLwriter();

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            agent.writeXML(employees, out);

            String xml = out.toString(StandardCharsets.UTF_8);
            String formattedXML = agent.formatXML(xml);

            Files.writeString(Path.of("Xml.xml"),
                    formattedXML, StandardCharsets.UTF_8);

        } catch (TransformerException | XMLStreamException | IOException e) {
            e.printStackTrace();
        }


        System.out.print("XML created");
        char ch = (char) System.in.read();

        //clearing the list
        employees.clear();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAXPars buff = new SAXPars();

        parser.parse(new File("C:/Users/User/Desktop/Ситаирис/Лр4/LAB/Xml.xml"), buff);

    }
}