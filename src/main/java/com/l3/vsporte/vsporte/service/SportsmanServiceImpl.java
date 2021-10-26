package com.l3.vsporte.vsporte.service;

import com.l3.vsporte.vsporte.dao.SportsmanDAO;
import com.l3.vsporte.vsporte.entity.Sportsman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SportsmanServiceImpl implements SportsmanService {

    @Autowired
    private SportsmanDAO sportsmanDAO;

    @Override
    @Transactional
    public List<Sportsman> getAllSportsmans() {
        return sportsmanDAO.getAllSportsmans();
    }

    @Override
    public void saveSportsman(Sportsman sportsman) {
        sportsmanDAO.saveSportsman(sportsman);
    }

    @Override
    public Sportsman getSportsman(Long id) {
        return sportsmanDAO.getSportsman(id);
    }

    @Override
    public void deleteSportsman(Long id) {
        sportsmanDAO.deleteSportsman(id);
    }
}
