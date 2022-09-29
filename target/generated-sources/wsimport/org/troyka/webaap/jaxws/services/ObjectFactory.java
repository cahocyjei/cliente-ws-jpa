
package org.troyka.webaap.jaxws.services;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.troyka.webaap.jaxws.services package. 
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

    private final static QName _Guardar_QNAME = new QName("http://services.jaxws.webaap.troyka.org/", "guardar");
    private final static QName _GuardarResponse_QNAME = new QName("http://services.jaxws.webaap.troyka.org/", "guardarResponse");
    private final static QName _Lista_QNAME = new QName("http://services.jaxws.webaap.troyka.org/", "lista");
    private final static QName _ListaResponse_QNAME = new QName("http://services.jaxws.webaap.troyka.org/", "listaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.troyka.webaap.jaxws.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Guardar }
     * 
     */
    public Guardar createGuardar() {
        return new Guardar();
    }

    /**
     * Create an instance of {@link GuardarResponse }
     * 
     */
    public GuardarResponse createGuardarResponse() {
        return new GuardarResponse();
    }

    /**
     * Create an instance of {@link Lista }
     * 
     */
    public Lista createLista() {
        return new Lista();
    }

    /**
     * Create an instance of {@link ListaResponse }
     * 
     */
    public ListaResponse createListaResponse() {
        return new ListaResponse();
    }

    /**
     * Create an instance of {@link Curso }
     * 
     */
    public Curso createCurso() {
        return new Curso();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guardar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Guardar }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webaap.troyka.org/", name = "guardar")
    public JAXBElement<Guardar> createGuardar(Guardar value) {
        return new JAXBElement<Guardar>(_Guardar_QNAME, Guardar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GuardarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webaap.troyka.org/", name = "guardarResponse")
    public JAXBElement<GuardarResponse> createGuardarResponse(GuardarResponse value) {
        return new JAXBElement<GuardarResponse>(_GuardarResponse_QNAME, GuardarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Lista }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webaap.troyka.org/", name = "lista")
    public JAXBElement<Lista> createLista(Lista value) {
        return new JAXBElement<Lista>(_Lista_QNAME, Lista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webaap.troyka.org/", name = "listaResponse")
    public JAXBElement<ListaResponse> createListaResponse(ListaResponse value) {
        return new JAXBElement<ListaResponse>(_ListaResponse_QNAME, ListaResponse.class, null, value);
    }

}
