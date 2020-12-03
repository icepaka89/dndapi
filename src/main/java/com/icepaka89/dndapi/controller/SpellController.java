package com.icepaka89.dndapi.controller;

import com.icepaka89.dndapi.model.Spell;
import com.icepaka89.dndapi.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/api/v1/spells")
@RestController
public class SpellController {

    private final SpellService spellService;

    @Autowired
    public SpellController(SpellService spellService) {
        this.spellService = spellService;
    }

    @GetMapping
    public List<Spell> getAllSpells() {
        return spellService.getAllSpells();
    }

    @GetMapping(value="/{className}")
    public List<Spell> getClassSpells(@PathVariable("className") String className) {
        return spellService.getClassSpells(className);
    }
}
