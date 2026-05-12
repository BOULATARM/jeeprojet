package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import caluclatrice.Clac;
/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		float a =Float.parseFloat(request.getParameter("n1"));
		float b=Float.parseFloat(request.getParameter("n2"));
		Clac o1=new Clac(a,b);
		
		float somme=o1.sum();
		float div=o1.div();
		float mul=o1.mul();
		float sou=o1.sou();
		String choix=request.getParameter("op");
		out.println();
		if(choix.equals("addition")) {out.println("la somme du "+a+" et "+b+" est :"+somme);}
		if(choix.equals("division")) {out.println("la division du "+a+" et "+b+" est:"+div);}
		if(choix.equals("multiplication")) {out.println("la multiplication du "+a+" et "+b+" est :"+mul);}
		if(choix.equals("soustraction")) {out.println("la soustraction du "+a+" et "+b+" est :"+sou);}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
