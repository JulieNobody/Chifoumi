package fr.Julie.Chifoumi.ihm;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.Julie.Chifoumi.bll.Jeu;


@WebServlet
(
		name="Chifoumi",
		urlPatterns="/Chifoumi"
)
public class ServletChifoumi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/WEB-INF/ChoixChifoumi.jsp");
		rd.forward(request, response);	

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String choixServer = Jeu.ChoixIntToString(Jeu.getRandom());
		String choixJoueur = request.getParameter("choix");
		String message = Jeu.resulats(choixJoueur, choixServer);

		request.setAttribute("resultat", message);
		request.setAttribute("choixJoueur", choixJoueur);
		request.setAttribute("choixServeur", choixServer);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/ResultatChifoumi.jsp");
		rd.forward(request, response);	
		
		System.out.println("Choix serveur : " + choixServer);
		System.out.println("Choix joueur : " + choixJoueur);
		System.out.println("Choix message : " + message);	
	}

}
