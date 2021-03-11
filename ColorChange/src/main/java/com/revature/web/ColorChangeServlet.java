package com.revature.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class ColorChangeServlet
 */
public class ColorChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Logger log = Logger.getLogger(ColorChangeServlet.class);
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		log.trace("Handling a POST request");
		
		String color = null;
		
		color = req.getParameter("color");
		
		log.trace("Color recieved is " + color);
		
		res.getWriter().write("<html><head><title>Colors!</title></head>"
				+ "<body style=\"background-color:" + color + "\">"
				+ "<a href=\"index.html\">Go Back</a>");
		
	}
	
}