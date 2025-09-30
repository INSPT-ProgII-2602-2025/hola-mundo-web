
package holamundo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


// Controlador verListaDeTerminators
public class VerTerminatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Traer la lista de Terminators del modelo
        
        // Ligar un atributo a nivel request con la lista de Terminators

        // Redirigir al JSP que corresponde (usará el atributo anterior)
        
    }        
    
    
}
