package com.hamidApp1.dao.pv.impl;

import com.hamidApp1.dao.pv.PvDao;
import com.hamidApp1.dao.pv.PvQueryDao;
import com.hamidApp1.model.pv.Pv;
import com.hamidApp1.model.pv.PvRegComFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
@Component
public class PvQueryDaoImpl implements PvQueryDao {

    @Autowired
    private PvDao pvDao;
    @Override
    public List<Pv> findAll() {
        return pvDao.findAll();
    }

    @Override
    public void savePv(Pv pvs) {
        pvDao.save(pvs);
    }

    @Override
    public List<Pv> getRegComCap(PvRegComFilter input) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        String pvQueryStr ="SELECT u FROM com.hamidApp1.model.pv.Pv u WHERE 1 = 1" ;

        if (input.getCap() != null && !input.getCap().isEmpty()) {
            pvQueryStr = pvQueryStr + " AND cap = '" + input.getCap() + "' ";
        }
        if (input.getComune() != null && !input.getComune().isEmpty()) {
            pvQueryStr = pvQueryStr + " AND comune = '" + input.getComune() + "' ";
        }
        System.out.println("user: " + pvQueryStr);

        TypedQuery<Pv> pvsQuery = em.createQuery(pvQueryStr , Pv.class);
        System.out.println("user: " + pvsQuery);
        List<Pv> pvResult = pvsQuery.getResultList();

        em.getTransaction().commit();
        return pvResult;
    }
}
