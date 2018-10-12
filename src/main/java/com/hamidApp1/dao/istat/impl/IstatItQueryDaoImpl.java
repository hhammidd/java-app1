package com.hamidApp1.dao.istat.impl;

import com.hamidApp1.dao.istat.IstatItDao;
import com.hamidApp1.dao.istat.IstatItQueryDao;
import com.hamidApp1.model.istat.Istat_it;
import com.hamidApp1.model.istat.Istat_it_filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Component
public class IstatItQueryDaoImpl implements IstatItQueryDao {
    @Autowired
    private IstatItDao istatItDao;

    @Override
    public List<Istat_it> findAll() {
        return istatItDao.findAll();
    }

    @Override
    public void saveIstat(Istat_it pvs) {
        istatItDao.save(pvs);
    }

    @Override
    public List<Istat_it> findByidRegion(int id_region) {
        return  istatItDao.findOne(id_region);
    }

    @Override
    public List<Istat_it> getAllIstatFilter(Istat_it_filter input) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        String usersQueryStr = "SELECT u FROM com.hamidApp1.model.istat.Istat_it u WHERE id_province = " + input.getId_province() +" AND id_region = " + input.getId_region();
        System.out.println("user: " + usersQueryStr);
        TypedQuery<Istat_it> usersQuery = em.createQuery(usersQueryStr, Istat_it.class);
        System.out.println("user: " + usersQuery);
        List<Istat_it> usersRes = usersQuery.getResultList();

        em.getTransaction().commit();
        return usersRes;
    }

    @Override
    public void removeIf(String id) {
        List<Istat_it> istatList = new ArrayList<>();
        istatList = istatItDao.findAll();

        System.out.println("Not completerd ");

    }
        }


