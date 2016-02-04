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
 * 测试ngResource和ngRoute结合使用servlet
 * @author guard
 * @date 2016年2月4日10:56:41
 */
public class ngResourceNgRouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id") != null ? request.getParameter("id") : "0";
		String name = id.equals("1") ? "zhangww" : "zhuhuan";
		String age = id.equals("1") ? "24岁" : "23岁";
		String job = id.equals("1") ? "Java工程师" : "软件工程师";
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
	}

}
