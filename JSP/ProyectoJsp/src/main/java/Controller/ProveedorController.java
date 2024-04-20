// ProveedorController.java
package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Proveedor;

public class ProveedorController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Proveedor> proveedores = new ArrayList<>();
        // Aquí deberías obtener los proveedores de alguna fuente de datos
        // Por simplicidad, aquí simplemente se crea una lista vacía

        req.setAttribute("proveedores", proveedores);
        req.getRequestDispatcher("/WEB-INF/views/proveedores/proveedorList.jsp").forward(req, resp);
    }

    // Aquí podrías implementar los métodos doPost, doPut, doDelete, etc., según tus necesidades
}
