package servlet.practica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class AlumnoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    public AlumnoServlet() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("iniciando");
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	System.out.println("ingresa");
        // Recoge los datos del formulario
        String nombre = request.getParameter("caja1");
        String apellido = request.getParameter("caja2");
        String sexo = request.getParameter("estado");
        String materia = request.getParameter("Materias");
        String textArea = request.getParameter("miTexto");

        // Crea un objeto de tipo Alumno
        Alumno alumno = new Alumno(nombre, apellido, sexo, materia, textArea);

        // Envía la respuesta al cliente
        response.setContentType("text/html");
        response.getWriter().append("<H2>Respuesta : Bienvenido :  "+nombre+ " " + apellido +"</H2>");
        
        System.out.println("Bienvenido: " + alumno.getNombre() + " " + alumno.getApellido() +
                "<br>Sexo: " + alumno.getSexo() +
                "<br>Materia: " + alumno.getMateria() +
                "<br>Texto: " + alumno.getTextArea());  
        
  //   // Lista para almacenar objetos Alumno
        List<Alumno> alumnos = new ArrayList<>();
     // Agrega objeto Alumno a la lista
        alumnos.add(alumno);   
     
     
     
     //2da forma de crear la lista
     //List<Alumno> alumnos = new ArrayList(alumno);
     
     //Imprimir lista
     for (Alumno alumno2 : alumnos) {
    	System.out.println(alumno2);
		System.out.println(alumno2.getApellido());
		System.out.println(alumno2.getNombre());
		System.out.println(alumno2.getMateria());
		System.out.println(alumno2.getSexo());
		System.out.println(alumno2.getTextArea());
	}
    }
}



	
	