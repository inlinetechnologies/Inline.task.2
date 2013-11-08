
package ru.mts.tender.inline.foris.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.mts.tender.inline.foris.client package. 
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

    private final static QName _GetBalancesResponse_QNAME = new QName("http://synch.inline.tender.mts.ru/", "GetBalancesResponse");
    private final static QName _GetBalances_QNAME = new QName("http://synch.inline.tender.mts.ru/", "GetBalances");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.mts.tender.inline.foris.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBalancesResponse }
     * 
     */
    public GetBalancesResponse createGetBalancesResponse() {
        return new GetBalancesResponse();
    }

    /**
     * Create an instance of {@link GetBalances }
     * 
     */
    public GetBalances createGetBalances() {
        return new GetBalances();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalancesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://synch.inline.tender.mts.ru/", name = "GetBalancesResponse")
    public JAXBElement<GetBalancesResponse> createGetBalancesResponse(GetBalancesResponse value) {
        return new JAXBElement<GetBalancesResponse>(_GetBalancesResponse_QNAME, GetBalancesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://synch.inline.tender.mts.ru/", name = "GetBalances")
    public JAXBElement<GetBalances> createGetBalances(GetBalances value) {
        return new JAXBElement<GetBalances>(_GetBalances_QNAME, GetBalances.class, null, value);
    }

}
