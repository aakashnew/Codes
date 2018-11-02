package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Product;
import com.form.AddProductForm;

public class AddProductAction extends Action {

		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
			
			
				HttpSession ses=request.getSession();
			
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			AddProductForm productform=(AddProductForm) form;
			Product product=new Product();
			BeanUtils.copyProperties(product, productform);
			session.beginTransaction();
			session.save(product);
			session.getTransaction().commit();
			
			session.close();
			return mapping.findForward("success");
			
			
		}
	


}
