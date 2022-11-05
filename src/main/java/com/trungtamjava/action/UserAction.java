package com.trungtamjava.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.trungtamjava.form.loginForm;

public class UserAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// String name= request.getParameter("name");
		String customerId = request.getParameter("customerId");
		String password = request.getParameter("password");
		
		loginForm user = (loginForm) form;
		user.setError("");
		if (customerId != null && password!=null) {
			if (user.getCustomerId().equals("a") && user.getPassword().equals("a")) {
				
				return mapping.findForward("search");

			}
			user.setError("SaiRoi");
		}
		return mapping.findForward("login");
	}
}
