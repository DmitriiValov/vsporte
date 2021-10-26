package com.l3.vsporte.vsporte.dao;

import com.l3.vsporte.vsporte.entity.Sportsman;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SportsmanDAOImpl implements SportsmanDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Sportsman> getAllSportsmans() {
        Session session = entityManager.unwrap(Session.class);
        Query<Sportsman> query = session.createQuery("from Sportsman", Sportsman.class);
        List<Sportsman> allSportsmans = query.getResultList();
        return allSportsmans;
    }

    @Override
    @Transactional
    public void saveSportsman(Sportsman sportsman) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(sportsman);
    }

    @Override
    public Sportsman getSportsman(Long id) {
        Session session = entityManager.unwrap(Session.class);
        Sportsman sportsman = session.get(Sportsman.class, id);
        return sportsman;
    }

    @Override
    @Transactional
    public void deleteSportsman(Long id) {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("delete from Sportsman where id =: id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
