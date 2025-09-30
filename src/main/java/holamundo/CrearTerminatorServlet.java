
package holamundo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


// Ruta para llegar a este controller: /terminators/crear
public class CrearTerminatorServlet extends HttpServlet {

    // Devolver el form para crear temrinator
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/pages/terminator-form.html");
    }

    // Crear un terminator
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lógica para crear un temrinator en la BD (hardcode) y luego redirigir a la lista de terminator
    }
    
    
    
    
}
