package com.l3.vsporte.vsporte.controller;

import com.l3.vsporte.vsporte.entity.Sportsman;
import com.l3.vsporte.vsporte.service.SportsmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private SportsmanService sportsmanService;

    @GetMapping("/sportsmans")
    public List<Sportsman> getAllSportsmans() {
        List<Sportsman> allSportsmans = sportsmanService.getAllSportsmans();
        return allSportsmans;
    }

    @GetMapping("/sportsmans/{id}")
    public Sportsman getSportsman(@PathVariable Long id) {
        Sportsman sportsman = sportsmanService.getSportsman(id);
        return sportsman;
    }

    @PostMapping("/sportsmans")
    public Sportsman addSportsman(@RequestBody Sportsman sportsman) {
        sportsmanService.saveSportsman(sportsman);
        return sportsman;
    }

    @PutMapping("/sportsmans")
    public Sportsman updateSportsman(@RequestBody Sportsman sportsman) {
        sportsmanService.saveSportsman(sportsman);
        return sportsman;
    }

    @DeleteMapping("/sportsmans/{id}")
    public void deleteSportsman(@PathVariable Long id) {
        sportsmanService.deleteSportsman(id);
    }
}
