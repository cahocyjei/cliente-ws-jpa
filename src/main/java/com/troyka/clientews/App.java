package com.troyka.clientews;

import org.troyka.webaap.jaxws.services.Curso;
import org.troyka.webaap.jaxws.services.ServiceCursoWs;
import org.troyka.webaap.jaxws.services.ServiceCursoWsImplService;

import jakarta.xml.ws.BindingProvider;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        ServiceCursoWs service = new ServiceCursoWsImplService().getServiceCursoWsImplPort();

        //((BindingProvider)service).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "omar");
        //((BindingProvider)service).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "1914");

        Curso curso = new Curso();

        curso.setName("Rubi OnRail");
        curso.setDescripcion("Lenguaje funxcional");
        //curso.setInstructor("Samuel Mejia");
        curso.setDuracion(25.05);
        Curso nuevoCurso = service.guardar(curso);
        System.out.println("Curso Guardado con exito: " +  nuevoCurso.getName());

        service.lista().stream().forEach(c ->{
            System.out.println(c.getName());
        });
    }
}
