package com.demopractice;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet2 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		/*PrintWriter out=res.getWriter();
		out.println("result is: "+k);*/
		//req.setAttribute("k",k);
		
		
		/*HttpSession session=req.getSession();
		session.setAttribute("k", k);*/
		
		/*RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req,res);*/
		//res.sendRedirect("sq?k="+k);
		
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
	}
	
	/*public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.println("result is: "+k);
	}*/
	

}
