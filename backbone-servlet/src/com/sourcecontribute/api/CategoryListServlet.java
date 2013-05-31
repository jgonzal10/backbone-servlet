package com.sourcecontribute.api;

import java.io.IOException;
import java.util.Collection;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sourcecontribute.models.Category;

/**
 * Servlet implementation class CategoryListServlet
 */
@WebServlet("/category/list")
public class CategoryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson = new Gson();
		Collection<Category> categories = new Stack<Category>();
		categories.add(new Category(0, "books"));
		categories.add(new Category(1, "music"));
		categories.add(new Category(2, "toys"));
		String result = gson.toJson(categories);
		response.getWriter().write(result);
	}

}
