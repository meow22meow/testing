package com.demopractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;



public class Square extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		 Cookie cookies[]=req.getCookies();
		
		int k=0;
		for(Cookie c :cookies)
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		/*int k=(int)req.getAttribute("k");*/
		//int k=Integer.parseInt(req.getParameter("k"));
		/*HttpSession session=req.getSession();
		int k=(int)session.getAttribute("k");*/
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Result is "+k);
		System.out.println("Called");
	}
}
