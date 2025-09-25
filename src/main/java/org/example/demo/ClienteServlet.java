package org.example.practica4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {
    private static final String FILE_PATH = "C:/temp/clientes.txt";

    // 👆 En Mac/Linux usa /tmp/, en Windows puedes usar "C:\\clientes.txt"


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Recibir parámetros
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String categoria = request.getParameter("categoria");
        String direccion = request.getParameter("direccion");

        // 2. Crear objeto Cliente
        org.example.practica4.Cliente cliente = new org.example.practica4.Cliente(id, nombre, categoria, direccion);

        // 3. Guardar en archivo (modo append)
        try (FileWriter fw = new FileWriter(FILE_PATH, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter outFile = new PrintWriter(bw)) {
            outFile.println(cliente.toString());
        }

        // 4. Respuesta al usuario
        response.setContentType("text/  html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style='font-family:Arial; text-align:center;'>");
        out.println("<h2>Cliente registrado exitosamente</h2>");
        out.println("<p><b>ID:</b> " + id + "</p>");
        out.println("<p><b>Nombre:</b> " + nombre + "</p>");
        out.println("<p><b>Categoría:</b> " + categoria + "</p>");
        out.println("<p><b>Dirección:</b> " + direccion + "</p>");
        out.println("<a href='index.html'>Registrar otro cliente</a>");
        out.println("</body></html>");
    }
}

