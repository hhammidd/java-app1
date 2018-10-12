package com.hamidApp1.dao.companies.impl;

import com.hamidApp1.dao.companies.CompaniesQueryDao;
import com.hamidApp1.model.companies.Companies;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class CompaniesDaoImpl implements CompaniesQueryDao {

    @Override
    public List<Companies> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Companies> usersQuery = em.createQuery("SELECT u FROM com.hamidApp1.model.companies.Companies u", Companies.class);
        List<Companies> usersRes = usersQuery.getResultList();
        System.out.println("Users: " + usersRes);
        em.getTransaction().commit();
        System.out.println("Done...");
        return usersRes;
    }
}
