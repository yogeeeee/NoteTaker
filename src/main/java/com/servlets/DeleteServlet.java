package com.servlets;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet{
	
	
	public DeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			int noteId=Integer.parseInt(req.getParameter("note_id").trim());
			Session s= FactoryProvider.getFactory().openSession();
			Transaction tx=s.beginTransaction();
			Note note=(Note)s.get(Note.class, noteId);
			s.remove(note);
			tx.commit();
			s.close();
			resp.sendRedirect("all_notes.jsp");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
