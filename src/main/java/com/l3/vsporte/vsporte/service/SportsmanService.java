package com.l3.vsporte.vsporte.service;

import com.l3.vsporte.vsporte.entity.Sportsman;

import java.util.List;

public interface SportsmanService {

    List<Sportsman> getAllSportsmans();

    void saveSportsman(Sportsman sportsman);

    Sportsman getSportsman(Long id);

    void deleteSportsman(Long id);
}
