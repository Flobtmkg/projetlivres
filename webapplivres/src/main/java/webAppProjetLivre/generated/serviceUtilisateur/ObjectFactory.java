
package webAppProjetLivre.generated.serviceUtilisateur;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.serviceUtilisateur package. 
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

    private final static QName _AutentifierResponse_QNAME = new QName("http://allplatform.webservice/", "autentifierResponse");
    private final static QName _ModifUtilisateur_QNAME = new QName("http://allplatform.webservice/", "modifUtilisateur");
    private final static QName _AjoutUtilisateur_QNAME = new QName("http://allplatform.webservice/", "ajoutUtilisateur");
    private final static QName _Autentifier_QNAME = new QName("http://allplatform.webservice/", "autentifier");
    private final static QName _AjoutUtilisateurResponse_QNAME = new QName("http://allplatform.webservice/", "ajoutUtilisateurResponse");
    private final static QName _ModifUtilisateurResponse_QNAME = new QName("http://allplatform.webservice/", "modifUtilisateurResponse");
    private final static QName _IsEmailExistResponse_QNAME = new QName("http://allplatform.webservice/", "isEmailExistResponse");
    private final static QName _IsEmailExist_QNAME = new QName("http://allplatform.webservice/", "isEmailExist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.serviceUtilisateur
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutentifierResponse }
     * 
     */
    public AutentifierResponse createAutentifierResponse() {
        return new AutentifierResponse();
    }

    /**
     * Create an instance of {@link ModifUtilisateur }
     * 
     */
    public ModifUtilisateur createModifUtilisateur() {
        return new ModifUtilisateur();
    }

    /**
     * Create an instance of {@link AjoutUtilisateur }
     * 
     */
    public AjoutUtilisateur createAjoutUtilisateur() {
        return new AjoutUtilisateur();
    }

    /**
     * Create an instance of {@link Autentifier }
     * 
     */
    public Autentifier createAutentifier() {
        return new Autentifier();
    }

    /**
     * Create an instance of {@link AjoutUtilisateurResponse }
     * 
     */
    public AjoutUtilisateurResponse createAjoutUtilisateurResponse() {
        return new AjoutUtilisateurResponse();
    }

    /**
     * Create an instance of {@link ModifUtilisateurResponse }
     * 
     */
    public ModifUtilisateurResponse createModifUtilisateurResponse() {
        return new ModifUtilisateurResponse();
    }

    /**
     * Create an instance of {@link IsEmailExistResponse }
     * 
     */
    public IsEmailExistResponse createIsEmailExistResponse() {
        return new IsEmailExistResponse();
    }

    /**
     * Create an instance of {@link IsEmailExist }
     * 
     */
    public IsEmailExist createIsEmailExist() {
        return new IsEmailExist();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutentifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "autentifierResponse")
    public JAXBElement<AutentifierResponse> createAutentifierResponse(AutentifierResponse value) {
        return new JAXBElement<AutentifierResponse>(_AutentifierResponse_QNAME, AutentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "modifUtilisateur")
    public JAXBElement<ModifUtilisateur> createModifUtilisateur(ModifUtilisateur value) {
        return new JAXBElement<ModifUtilisateur>(_ModifUtilisateur_QNAME, ModifUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "ajoutUtilisateur")
    public JAXBElement<AjoutUtilisateur> createAjoutUtilisateur(AjoutUtilisateur value) {
        return new JAXBElement<AjoutUtilisateur>(_AjoutUtilisateur_QNAME, AjoutUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "autentifier")
    public JAXBElement<Autentifier> createAutentifier(Autentifier value) {
        return new JAXBElement<Autentifier>(_Autentifier_QNAME, Autentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "ajoutUtilisateurResponse")
    public JAXBElement<AjoutUtilisateurResponse> createAjoutUtilisateurResponse(AjoutUtilisateurResponse value) {
        return new JAXBElement<AjoutUtilisateurResponse>(_AjoutUtilisateurResponse_QNAME, AjoutUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "modifUtilisateurResponse")
    public JAXBElement<ModifUtilisateurResponse> createModifUtilisateurResponse(ModifUtilisateurResponse value) {
        return new JAXBElement<ModifUtilisateurResponse>(_ModifUtilisateurResponse_QNAME, ModifUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsEmailExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "isEmailExistResponse")
    public JAXBElement<IsEmailExistResponse> createIsEmailExistResponse(IsEmailExistResponse value) {
        return new JAXBElement<IsEmailExistResponse>(_IsEmailExistResponse_QNAME, IsEmailExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsEmailExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://allplatform.webservice/", name = "isEmailExist")
    public JAXBElement<IsEmailExist> createIsEmailExist(IsEmailExist value) {
        return new JAXBElement<IsEmailExist>(_IsEmailExist_QNAME, IsEmailExist.class, null, value);
    }

}
