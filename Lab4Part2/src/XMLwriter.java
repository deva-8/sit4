import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class XMLwriter {

    public void writeXML(List<Rabotniki> employees, OutputStream out)
            throws FileNotFoundException, XMLStreamException {
        //creating xml
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = factory.createXMLStreamWriter(out);
        writer.writeStartDocument();
        writer.writeStartElement("doc");
        // writer.writeStartElement("employees");
        for(Rabotniki emp : employees){
            // writer.writeStartElement("employee");

            writer.writeStartElement("id");
            writer.writeCharacters(Integer.toString(emp.getId()));
            writer.writeEndElement();

            writer.writeStartElement("fam");
            writer.writeCharacters(emp.getFam());
            writer.writeEndElement();

            writer.writeStartElement("name");
            writer.writeCharacters(emp.getName());
            writer.writeEndElement();

            writer.writeStartElement("otc");
            writer.writeCharacters(emp.getOtc());
            writer.writeEndElement();

            writer.writeStartElement("dateb");
            writer.writeCharacters(emp.getDateb());
            writer.writeEndElement();

            writer.writeStartElement("datep");
            writer.writeCharacters(emp.getDatep());
            writer.writeEndElement();

            writer.writeStartElement("datev");
            writer.writeCharacters(emp.getDatev());
            writer.writeEndElement();

            writer.writeStartElement("datebegin");
            writer.writeCharacters(emp.getDatebegin());
            writer.writeEndElement();

            writer.writeStartElement("dateend");
            writer.writeCharacters(emp.getDateend());
            writer.writeEndElement();

            writer.writeStartElement("vdolid");
            writer.writeCharacters(Integer.toString(emp.getVdolid()));
            writer.writeEndElement();

            writer.writeStartElement("specid");
            writer.writeCharacters(Integer.toString(emp.getSpecid()));
            writer.writeEndElement();

            writer.writeStartElement("klavid");
            writer.writeCharacters(Integer.toString(emp.getKlavid()));
            writer.writeEndElement();

            writer.writeStartElement("stav");
            writer.writeCharacters(Float.toString(emp.getStav()));
            writer.writeEndElement();

            writer.writeStartElement("progid");
            writer.writeCharacters(Integer.toString(emp.getProgid()));
            writer.writeEndElement();

            // writer.writeEndElement();
        }
        // writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();
        writer.flush();
        writer.close();
    }


    public String formatXML(String xml) throws TransformerException {
        // write data to xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // pretty print by indention
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        // add standalone="yes", add line break before the root element
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

        StreamSource source = new StreamSource(new StringReader(xml));
        StringWriter output = new StringWriter();
        transformer.transform(source, new StreamResult(output));

        return output.toString();
    }

}



/*
// import org.classes.Employee;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class XMLwriter
{
    public void writeXML(List<Rabotniki> employees, OutputStream out)
            throws FileNotFoundException, XMLStreamException {
        //creating xml
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = factory.createXMLStreamWriter(out);
        writer.writeStartDocument();
        writer.writeStartElement("root");
        // writer.writeStartElement("employees");
        for(Rabotniki emp : employees){
            // writer.writeStartElement("employee");

            // writer.writeEndElement();
        }
        // writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();
        writer.flush();
        writer.close();
    }

    public String formatXML(String xml) throws TransformerException {

        // write data to xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // pretty print by indention
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        // add standalone="yes", add line break before the root element
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

        StreamSource source = new StreamSource(new StringReader(xml));
        StringWriter output = new StringWriter();
        transformer.transform(source, new StreamResult(output));

        return output.toString();
    }
}
*/