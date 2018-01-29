
package projetlivrebatchservice.batch.clientservices.generated.servicePret;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicePret", targetNamespace = "http://allplatform.webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicePret {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<generated.servicePret.Pret>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerInfosPretUtilisateur", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.ListerInfosPretUtilisateur")
    @ResponseWrapper(localName = "listerInfosPretUtilisateurResponse", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.ListerInfosPretUtilisateurResponse")
    @Action(input = "http://allplatform.webservice/ServicePret/listerInfosPretUtilisateurRequest", output = "http://allplatform.webservice/ServicePret/listerInfosPretUtilisateurResponse")
    public List<Pret> listerInfosPretUtilisateur(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<generated.servicePret.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerUtilisateursPretsNonRendus", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.ListerUtilisateursPretsNonRendus")
    @ResponseWrapper(localName = "listerUtilisateursPretsNonRendusResponse", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.ListerUtilisateursPretsNonRendusResponse")
    @Action(input = "http://allplatform.webservice/ServicePret/listerUtilisateursPretsNonRendusRequest", output = "http://allplatform.webservice/ServicePret/listerUtilisateursPretsNonRendusResponse")
    public List<Reservation> listerUtilisateursPretsNonRendus();

    /**
     * 
     * @param arg0
     * @return
     *     returns generated.servicePret.Pret
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "etatPret", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.EtatPret")
    @ResponseWrapper(localName = "etatPretResponse", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.EtatPretResponse")
    @Action(input = "http://allplatform.webservice/ServicePret/etatPretRequest", output = "http://allplatform.webservice/ServicePret/etatPretResponse")
    public Pret etatPret(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "prolongerPret", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.ProlongerPret")
    @ResponseWrapper(localName = "prolongerPretResponse", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.ProlongerPretResponse")
    @Action(input = "http://allplatform.webservice/ServicePret/prolongerPretRequest", output = "http://allplatform.webservice/ServicePret/prolongerPretResponse")
    public void prolongerPret(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "ajouterPret", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.AjouterPret")
    @ResponseWrapper(localName = "ajouterPretResponse", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.AjouterPretResponse")
    @Action(input = "http://allplatform.webservice/ServicePret/ajouterPretRequest", output = "http://allplatform.webservice/ServicePret/ajouterPretResponse")
    public void ajouterPret(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        boolean arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        boolean arg5);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "retourPret", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.RetourPret")
    @ResponseWrapper(localName = "retourPretResponse", targetNamespace = "http://allplatform.webservice/", className = "generated.servicePret.RetourPretResponse")
    @Action(input = "http://allplatform.webservice/ServicePret/retourPretRequest", output = "http://allplatform.webservice/ServicePret/retourPretResponse")
    public void retourPret(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
