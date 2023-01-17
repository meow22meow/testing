package com.demopractice;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html;charset=UTF-8");
	String name=req.getParameter("name");
	PrintWriter out=res.getWriter();
	out.println("My name is "+name);
	Cookie c=new Cookie("user_name",name);
	res.addCookie(c);
	
	out.println("<h1><a href='servlet2'>Go to servlet2</h1>");
	
	}
}
