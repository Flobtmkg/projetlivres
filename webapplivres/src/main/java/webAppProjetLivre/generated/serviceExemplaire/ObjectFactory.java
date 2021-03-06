
package webAppProjetLivre.generated.serviceExemplaire;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.serviceExemplaire package.
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

    private final static QName _ExemplaireDisponibleResponse_QNAME = new QName("http://allplatform.webservice/", "ExemplaireDisponibleResponse");
    private final static QName _AjouterExemplaire_QNAME = new QName("http://allplatform.webservice/", "AjouterExemplaire");
    private final static QName _AjouterExemplaireResponse_QNAME = new QName("http://allplatform.webservice/", "AjouterExemplaireResponse");
    private final static QName _ExemplaireDisponible_QNAME = new QName("http://allplatform.webservice/", "ExemplaireDisponible");
    private final static QName _ListerExemplaireResponse_QNAME = new QName("http://allplatform.webservice/", "listerExemplaireResponse");
    private final static QName _ListerExemplaire_QNAME = new QName("http://allplatform.webservice/", "listerExemplaire");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.serviceExemplaire
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExemplaireDisponibleResponse }
     * 
     */
    public ExemplaireDisponibleResponse createExemplaireDisponibleResponse() {
        return new ExemplaireDisponibleResponse();
    }

    /**
     * Create an instance of {@link AjouterExemplaire }
     * 
     */
    public AjouterExemplaire createAjouterExemplaire() {
        return new AjouterExemplaire();
    }

    /**
     * Create an instance of {@link AjouterExemplaireResponse }
     * 
     */
    public AjouterExemplaireResponse createAjouterExemplaireResponse() {
        return new AjouterExemplaireResponse();
    }

    /**
     * Create an instance of {@link ExemplaireDisponible }
     * 
     */
    public ExemplaireDisponible createExemplaireDisponible() {
        return new ExemplaireDisponible();
    }

    /**
     * Create an instance of {@link ListerExemplaireResponse }
     * 
     */
    public ListerExemplaireResponse createListerExemplaireResponse() {
        return new ListerExemplaireResponse();
    }

    /**
     * Create an instance of {@link ListerExemplaire }
     * 
     */
    public ListerExemplaire createListerExemplaire() {
        return new ListerExemplaire();
    }

    /**
     * Create an instance of {@link Exemplaire }
     * 
     */
    public Exemplaire createExemplaire() {
        return new Exemplaire();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemplaireDisponibleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "ExemplaireDisponibleResponse")
    public JAXBElement<ExemplaireDisponibleResponse> createExemplaireDisponibleResponse(ExemplaireDisponibleResponse value) {
        return new JAXBElement<ExemplaireDisponibleResponse>(_ExemplaireDisponibleResponse_QNAME, ExemplaireDisponibleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterExemplaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "AjouterExemplaire")
    public JAXBElement<AjouterExemplaire> createAjouterExemplaire(AjouterExemplaire value) {
        return new JAXBElement<AjouterExemplaire>(_AjouterExemplaire_QNAME, AjouterExemplaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterExemplaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "AjouterExemplaireResponse")
    public JAXBElement<AjouterExemplaireResponse> createAjouterExemplaireResponse(AjouterExemplaireResponse value) {
        return new JAXBElement<AjouterExemplaireResponse>(_AjouterExemplaireResponse_QNAME, AjouterExemplaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemplaireDisponible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "ExemplaireDisponible")
    public JAXBElement<ExemplaireDisponible> createExemplaireDisponible(ExemplaireDisponible value) {
        return new JAXBElement<ExemplaireDisponible>(_ExemplaireDisponible_QNAME, ExemplaireDisponible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerExemplaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "listerExemplaireResponse")
    public JAXBElement<ListerExemplaireResponse> createListerExemplaireResponse(ListerExemplaireResponse value) {
        return new JAXBElement<ListerExemplaireResponse>(_ListerExemplaireResponse_QNAME, ListerExemplaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerExemplaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "listerExemplaire")
    public JAXBElement<ListerExemplaire> createListerExemplaire(ListerExemplaire value) {
        return new JAXBElement<ListerExemplaire>(_ListerExemplaire_QNAME, ListerExemplaire.class, null, value);
    }

}
