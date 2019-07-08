package com.empresa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletDatos", urlPatterns = {"/ServletDatos"})
public class ServletDatos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String nombre = request.getParameter("nombre");
        String genero = request.getParameter("genero");
        String estudios = request.getParameter("estudios");
        String[] deportes = request.getParameterValues("deportes");       
        String [] pasatiempos = request.getParameterValues("pasatiempos");
        
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("nombre", nombre);
        sesion.setAttribute("genero", genero);
        sesion.setAttribute("estudios", estudios);
        sesion.setAttribute("deportes", Arrays.toString(deportes));
        sesion.setAttribute("pasatiempos", Arrays.toString(pasatiempos));
        
        
        response.sendRedirect("salida.jsp");  
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
