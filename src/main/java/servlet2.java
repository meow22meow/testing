import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		Cookie cookies[]=req.getCookies();
		boolean f=false;
		String name="";
		if(cookies==null)
			out.println("<h1>New user please enter name");
		else
		{
			for(Cookie c:cookies)
			{
				String tname=c.getName();
				if(tname.equals("user_name"))
				{
					f=true;
					name=c.getValue();
				}
			}
		}
		
	//String name=req.getParameter("name");
	if(f)
		{
			out.println("Welcome back "+name);
		}
	else
		out.println("<h1>New user please enter name");

	}

}
