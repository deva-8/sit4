import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

public class SAXPars extends DefaultHandler {

    Rabotniki rabotniki = new Rabotniki();
    String thisElement = "";

    public Rabotniki getResult()
    {
        return rabotniki;
    }

    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException
    {
        thisElement = qName;
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("id")) {
            rabotniki.setId(Integer.valueOf(new String(ch, start, length)));
        }
        if (thisElement.equals("fam")) {
            rabotniki.setFam(new String(ch, start, length));
        }
        if (thisElement.equals("name")) {
            rabotniki.setName(new String(ch, start, length));
        }
        if (thisElement.equals("otc")) {
            rabotniki.setOtc(new String(ch, start, length));
        }
        if (thisElement.equals("dateb")) {
            rabotniki.setDateb(new String(ch, start, length));
        }
        if (thisElement.equals("datep")) {
            rabotniki.setDatep(new String(ch, start, length));
        }
        if (thisElement.equals("datev")) {
            rabotniki.setDatev(new String(ch, start, length));
        }
        if (thisElement.equals("datebegin")) {
            rabotniki.setDatebegin(new String(ch, start, length));
        }
        if (thisElement.equals("dateend")) {
            rabotniki.setDateend(new String(ch, start, length));
        }
        if (thisElement.equals("vdolid")) {
            rabotniki.setVdolid(Integer.valueOf(new String(ch, start, length)));
        }
        if (thisElement.equals("specid")) {
            rabotniki.setSpecid(Integer.valueOf(new String(ch, start, length)));
        }
        if (thisElement.equals("klavid")) {
            rabotniki.setKlavid(Integer.valueOf(new String(ch, start, length)));
        }
        if (thisElement.equals("stav")) {
            rabotniki.setStav(Float.valueOf(new String(ch, start, length)));
        }
        if (thisElement.equals("progid")) {
            rabotniki.setProgid(Integer.valueOf(new String(ch, start, length)));
        }
    }

    public void endElement(String namespaceURI, String localName, String qName) throws SAXException
    {
        thisElement = "";
    }
}
