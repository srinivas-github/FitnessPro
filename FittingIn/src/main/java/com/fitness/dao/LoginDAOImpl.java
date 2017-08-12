package com.fitness.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAOImpl implements LoginDAO{

	 @Resource(name="sessionFactory")
     protected SessionFactory sessionFactory;

     public void setSessionFactory(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
     }
    
     protected Session getSession(){
            return sessionFactory.openSession();
     }

     public boolean checkLogin(String userName, String userPassword){
			System.out.println("Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			String SQL_QUERY =" from fitn.signup as o where o.userName=? and o.userPassword=?";
			
			Query query=(Query) session.createQuery(SQL_QUERY);
			
			query.setParameter(1, userName);
			query.setParameter(2,userPassword);
			
			List list=query.getResultList();
			
			if(!list.isEmpty()){
				userFound= true;
			}
			session.close();
			return userFound;
			
			     }
}

