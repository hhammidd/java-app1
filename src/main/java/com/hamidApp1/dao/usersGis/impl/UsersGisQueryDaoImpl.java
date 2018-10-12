package com.hamidApp1.dao.usersGis.impl;

import com.hamidApp1.dao.usersGis.UsersGisDao;
import com.hamidApp1.dao.usersGis.UsersGisQueryDao;
import com.hamidApp1.model.pv.Pv;
import com.hamidApp1.model.usersGis.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
public class UsersGisQueryDaoImpl implements UsersGisQueryDao {

    @Autowired
    private UsersGisDao usersGisDao;

    @Override
    public List<UsersGis> findAll() {
        return usersGisDao.findAll();
    }

    @Override
    public void saveUser(UsersGis pvs) {
         usersGisDao.save(pvs);
    }

    @Override
    public UsersGis findById(int id_user) {
        return usersGisDao.findOne(id_user);
    }

    @Override
    public List<UsersGis> findByUserName(String user_name) {
        return usersGisDao.findOne(user_name);
    }

    @Override
    public UserInfo findUsersInfo(UserInput userInput) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        String userQueryStr ="SELECT name_company,user_name,id_user,administrator,password,ut.id_company FROM"
                + " companies az JOIN usersgis ut on az.id_company=ut.id_company WHERE 1 = 1" ;

        if (userInput.getPassword() != null && !userInput.getPassword().isEmpty()) {
            userQueryStr = userQueryStr + " AND password = '" + userInput.getPassword() + "' ";
        }
        if (userInput.getUser_name() != null && !userInput.getUser_name().isEmpty()) {
            userQueryStr = userQueryStr + " AND user_name = '" + userInput.getUser_name() + "' ";
        }
        System.out.println("userInputQuery: " + userQueryStr);

        TypedQuery<UserInfo> pvsQuery = (TypedQuery<UserInfo>) em.createNativeQuery(userQueryStr , UserInfo.class);
        System.out.println("user: " + pvsQuery);
        UserInfo pvResult = pvsQuery.getSingleResult();


        em.getTransaction().commit();

        return pvResult;
    }



    @Override
    public List<UserPermissions> findUsersPermit(UserInfo userInfos) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        String userQueryStr ="SELECT administrator, user_name, id_user, id_company_mGis, "
		+ "	id_role, p.name, p.id_permission "
		+ "FROM usersgis u JOIN rules r ON r.id_rule = u.id_role JOIN rules_permissions rp ON rp.id_rule = r.id_rule JOIN permissions p ON p.id_permission = rp.id_permissions WHERE 1 = 1"
		 ;


           userQueryStr = userQueryStr + " AND u.id_user = '" + userInfos.getId_user() + "' ";

           userQueryStr = userQueryStr + " AND u.user_name = '" + userInfos.getUser_name() + "' ";

        System.out.println("userInputQuery: " + userQueryStr);

        TypedQuery<UserPermissions> pvsQuery = (TypedQuery<UserPermissions>) em.createNativeQuery(userQueryStr , UserPermissions.class);
        System.out.println("user: " + pvsQuery);
        List<UserPermissions> pvResult = pvsQuery.getResultList();

       // System.out.println("ba: " + pvResult.get(2).getId_permission());
         for (UserPermissions u : pvResult){
            System.out.println("ff1: " + u.getId_permission());
        }
        em.getTransaction().commit();
        return pvResult;

    }
}
