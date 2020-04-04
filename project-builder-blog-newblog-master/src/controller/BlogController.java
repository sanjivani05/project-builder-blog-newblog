package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Blog;
import model.User;




@WebServlet(urlPatterns= {"/blog"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BlogController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String blogDetails = request.getParameter("selectedAnswers");
		
		
		

		String blogdata[]=blogDetails.split(",");
		String title=blogdata[0];
		String description=blogdata[1];
		Blog blog=new Blog();
		blog.settitle(title);
		blog.setdescription(description);
		
		if(blog!=null) {
			request.setAttribute("blog", blog);
		//	request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
			System.out.println("Blog Title: "+title);
			System.out.println("Blog Description: "+description);
			System.out.println("Posted on: 2020-03-03");
			
		}
	
	}

}