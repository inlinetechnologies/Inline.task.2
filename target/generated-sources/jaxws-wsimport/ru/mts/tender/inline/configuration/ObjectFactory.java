
package ru.mts.tender.inline.configuration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.mts.tender.inline.configuration package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetILAdapterParametersResponse_QNAME = new QName("http://configuration.inline.tender.mts.ru/", "getILAdapterParametersResponse");
    private final static QName _GetILAdapterParameters_QNAME = new QName("http://configuration.inline.tender.mts.ru/", "getILAdapterParameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.mts.tender.inline.configuration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetILAdapterParameters }
     * 
     */
    public GetILAdapterParameters createGetILAdapterParameters() {
        return new GetILAdapterParameters();
    }

    /**
     * Create an instance of {@link GetILAdapterParametersResponse }
     * 
     */
    public GetILAdapterParametersResponse createGetILAdapterParametersResponse() {
        return new GetILAdapterParametersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetILAdapterParametersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.inline.tender.mts.ru/", name = "getILAdapterParametersResponse")
    public JAXBElement<GetILAdapterParametersResponse> createGetILAdapterParametersResponse(GetILAdapterParametersResponse value) {
        return new JAXBElement<GetILAdapterParametersResponse>(_GetILAdapterParametersResponse_QNAME, GetILAdapterParametersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetILAdapterParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://configuration.inline.tender.mts.ru/", name = "getILAdapterParameters")
    public JAXBElement<GetILAdapterParameters> createGetILAdapterParameters(GetILAdapterParameters value) {
        return new JAXBElement<GetILAdapterParameters>(_GetILAdapterParameters_QNAME, GetILAdapterParameters.class, null, value);
    }

}
