package com.guillermods.web.home.servlet;

import java.io.IOException;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guillermods.sample.pet.service.PetServiceRemote;
import com.guillermods.web.home.model.SampleModel;

@WebServlet(urlPatterns = { "/home" })
public class HomeServlet extends HttpServlet {

	@EJB(lookup = SERVICE)
	private PetServiceRemote petServiceRemote;

	/**
	 * 
	 */
	private static final long serialVersionUID = 3247579464330026030L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		SampleModel model = new SampleModel();
		model.setSampleDate(new Date());
		model.setSampleName("TestModel");

		req.setAttribute("testModel", model);
		req.setAttribute("pets", petServiceRemote.getAllPets());

		req.getRequestDispatcher("views/home/index.jsp").forward(req, resp); 
	}
	
	private static final String SERVICE = "java:global/sample-ee-ear-0.0.1-SNAPSHOT/sample-ee-web-0.0.1-SNAPSHOT/PetServiceImpl!com.guillermods.sample.pet.service.PetServiceRemote";
	

}
