package com.trungtamjava.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import com.trungtamjava.model.User;

public class UserAction extends MappingDispatchAction {
	public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		user.setName("TrungTamJava");
		return mapping.findForward("addUser");
	}
	public ActionForward deletUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		user.setName("TrungTamJava");
		return mapping.findForward("deletUser");
	}
	public ActionForward updateUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		return mapping.findForward("updateUser");
	}
	public ActionForward viewUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//String name= request.getParameter("name");
		String name="hello";
		User userdto = new User();
		userdto.setName(name);
		User user = (User) form;
		user.setName(userdto.getName());
		return mapping.findForward("viewUser");
	}
}
