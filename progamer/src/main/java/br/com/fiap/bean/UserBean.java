package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.UserDAO;
import br.com.fiap.model.User;

@Named
@RequestScoped
public class UserBean {

	private User user = new User();

	public void save() {
		new UserDAO().save(user);
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage("Usuário cadastrado com sucesso"));
	}
	
	public String login() {
		FacesContext context = FacesContext.getCurrentInstance();
		boolean exist = new UserDAO().exist(user);
		if (exist) {
			context.getExternalContext().getSessionMap().put("user", user);
			return "index?faces-redirect=true";
		}
		
		
		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login inválido", ""));
		return "login?faces-redirect=true";
	}
	
	public String logout() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().remove("user");
		
		return "login?faces-redirect=true";

	}

	public List<User> getUsers() {
		return new UserDAO().getAll();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
