package controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import repository.UserRepository;
import util.EmailUtility;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserRepository userRepository = new UserRepository();
	EmailUtility emailUtility = new EmailUtility();

	public RegisterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/Register.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String rePass = request.getParameter("repassword");

		if (!rePass.equalsIgnoreCase(password)) {
			request.setAttribute("error", "Password is not correct !");
			request.getRequestDispatcher("/views/Register.jsp").forward(request, response);
			return;
		}
		if (userRepository.getUserbyUserName(user) != null) {
			request.setAttribute("error", "User is exsit ! Try again !");
			request.getRequestDispatcher("/views/Register.jsp").forward(request, response);
			return;
		}
		if (userRepository.getUserByEmail(email) != null) {
			request.setAttribute("error", "Email is exsit ! Try again !");
			request.getRequestDispatcher("/views/Register.jsp").forward(request, response);
			return;
		}
		User user2 = new User();
		user2.setUsername(user);
		user2.setPassword(password);
		user2.setEmail(email);
		user2.setIsAdmin(false);
		user2.setIsActive(true);
		if (userRepository.createUser(user2) == true) {
			try {
				emailUtility.guiMail(email, "Chuc Mung " + user
						+ " da dang ki thanh cong ! \n Dang nhap ngay va tan huong the gioi giai tri tuyet voi !");
				String path = request.getContextPath();
				response.sendRedirect(path + "/views/login");
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			request.setAttribute("error", "Register fail !");
			request.getRequestDispatcher("/views/Register.jsp").forward(request, response);
		}

	}

}