package com.guard.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
/**
 * 测试ngResource插件的servlet
 * @author guard
 * @date 2016年2月3日17:03:08
 */
public class NgResourceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id") != null ? request.getParameter("id") : "0";
		String name = request.getParameter("name") != null ? request.getParameter("name") : "默认姓名";
		String age = request.getParameter("age") != null ? request.getParameter("age") : "默认1岁";
		String job = request.getParameter("job") != null ? request.getParameter("job") : "默认工程师";
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("name", name);
		map.put("age", age);
		map.put("job", job);
		JSONObject obj = JSONObject.fromObject(map);
		System.out.println(obj);
		PrintWriter out = response.getWriter();
		out.print(obj.toString());
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String job = request.getParameter("job");
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("name", name);
		map.put("age", age);
		map.put("job", job);
		JSONObject obj = JSONObject.fromObject(map);
		System.out.println(obj);
		PrintWriter out = response.getWriter();
		out.print(obj.toString());
		out.close();
	}

}
