package com.kfm.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

public abstract class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CHARSET = "UTF-8";
//	private final String IMG_PATH = "http://192.168.31.160/images";
	private final String IMG_PATH = "http://localhost/images";
	
    public JsonServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding(CHARSET);
		response.setContentType("application/json;charset="+CHARSET);
		String input =request.getParameter("content");
		Map<String, String[]> parameterMap = request.getParameterMap();
		PrintWriter out = response.getWriter();
		out.println(dealInput(parameterMap));
		out.flush();
		out.close();
	}

	public abstract String dealInput(Map<String, String[]> input);

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
}
