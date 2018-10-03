package com.hamidApp1.dao.merchant;

import com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class MerchantFraudToolBigDaoImpl implements MerchantFraudToolBigDao {

    @Autowired
    private MerchantFraudToolDao merchantFraudToolDao;

    @Override
    public List<BaseMerchantFraudToolBean> findAll() {
        return  merchantFraudToolDao.findAll();
    }

    @Override
    public void getData(int i) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<BaseMerchantFraudToolBean> usersQuery = em.createQuery("SELECT u FROM com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean u", BaseMerchantFraudToolBean.class);
        List<BaseMerchantFraudToolBean> usersRes = usersQuery.getResultList();
        System.out.println("Users: " + usersRes);
        em.getTransaction().commit();
        System.out.println("Done...");

    }
}
