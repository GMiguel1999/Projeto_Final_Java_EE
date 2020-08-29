package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controle.Adm;
import controle.Funcionario;

@WebServlet("/ServletAdmExcluirFuncionario")
public class ServletAdmExcluirFuncionario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cpf = request.getParameter("cpf");
		
		HttpSession session = request.getSession();
		
		Adm auxiliarAdm = (Adm) session.getAttribute("adm");
		Funcionario auxiliarFunc = new Funcionario(cpf);
		
		if (auxiliarAdm.excluirFuncionario(auxiliarFunc)) {
			session.setAttribute("msg", auxiliarAdm.getMsg());
			session.setAttribute("erroMsg", null);
			response.sendRedirect("./jsp/Adm/admMenu.jsp");
		} else {
			session.setAttribute("erro", true);
			session.setAttribute("erroMsg", auxiliarAdm.getMsg());
			response.sendRedirect("./jsp/Adm/admExcluirFuncionario.jsp");
		}
	}

}
