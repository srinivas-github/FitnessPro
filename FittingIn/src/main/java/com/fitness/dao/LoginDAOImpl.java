package com.fitness.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import main.java.com.fitness.entity.GoalSetting;
import main.java.com.fitness.entity.User;

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

	@Override
	public List<User> getUserActivities() {
		List<User> userList=new ArrayList<User>();
		try{
			Session session=sessionFactory.openSession();
			List<GoalSetting> list=(List)session.createQuery("from GoalSetting").list();
			Collections.sort(list,new Comparator<GoalSetting>() {
				
				public int compare(GoalSetting u1,GoalSetting u2){
					
					int result= u1.getPushups()-u2.getPushups();
					if(result != 0){
						return result;
					}
					result= u1.getAbs()-u2.getAbs();
					if(result != 0){
						return result;
					}
					result= u1.getSteps()-u2.getSteps();
					if(result != 0){
						return result;
					}
					result= u1.getSquats()-u2.getSquats();
					if(result != 0){
						return result;
					}
					result= u1.getCycling()-u2.getCycling();
					if(result != 0){
						return result;
					}
				}
			});
			int count=0;
			for(GoalSetting gs:list){
				User user=new User();
				user.setUserId(gs.getUserId());
				user.setUserName(gs.getUserName());
				user.setActivity(gs);
				user.setRank(count++);
				userList.add(user);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}

