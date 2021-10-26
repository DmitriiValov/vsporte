package com.l3.vsporte.vsporte.dao;

import com.l3.vsporte.vsporte.entity.Sportsman;

import java.util.List;

public interface SportsmanDAO  {

    List<Sportsman> getAllSportsmans();

    void saveSportsman(Sportsman sportsman);

    Sportsman getSportsman(Long id);

    void deleteSportsman(Long id);
}
