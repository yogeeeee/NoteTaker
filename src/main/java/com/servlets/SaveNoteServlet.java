package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SaveNoteServlet extends HttpServlet{
	
	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//title content fetch
			String title= req.getParameter("tittle");
			String content= req.getParameter("content");
			
			Note note=new Note(1, title, content, new Date());
			//System.out.println(note.getId()+" : "+note.getContent());
			//hibernate save
			Session s= FactoryProvider.getFactory().openSession();
			Transaction tx= s.beginTransaction();
			
			s.persist(note);
			tx.commit();
			s.close();
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			out.println("<h1 style='text-allign:centre;'> Note is added successfully </h1>");
			out.println("<h1 style='text-allign:centre;'><a href ='all_notes.jsp'> View all notes </a> </h1>");
			
		} catch (Exception e) {
			
		}
		
	}
	
}
