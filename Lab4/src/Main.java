import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Main
{
    public static void main(String[] args) throws javax.xml.parsers.ParserConfigurationException,
            org.xml.sax.SAXException,
            java.io.IOException
    {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAXPars saxp = new SAXPars();

        parser.parse(new File("Xml.xml"), saxp);

        Rabotniki rabotniki = saxp.getResult();

        System.out.println("ФАМИЛИЯ: " + rabotniki.getFam());
        System.out.println("ИМЯ: " + rabotniki.getName());
        System.out.println("ОТЧЕСТВО: " + rabotniki.getOtc());
    }
}