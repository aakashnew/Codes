package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Product;
import com.form.AddProductForm;

public class DeleteProductAction extends Action{



	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();

		AddProductForm deleteForm = (AddProductForm) form;
		System.out.println("inside delete---"+deleteForm.getProductId());
		Configuration configuration = new Configuration().configure();  	
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session sess = sessionFactory.openSession();
		Product product =  (Product) sess.get(Product.class,deleteForm.getProductId());//Integer.parseInt(userid));
		sess.beginTransaction();
		sess.delete(product);
		sess.getTransaction().commit();
		sess.close();


		return mapping.findForward("delete");
	}

}