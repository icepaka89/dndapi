package com.icepaka89.dndapi.service;

import com.icepaka89.dndapi.dao.SpellDao;
import com.icepaka89.dndapi.model.Spell;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SpellService {

    private final SpellDao spellDao;

    @Autowired
    public SpellService(@Qualifier("mysql_spell") SpellDao spellDao) {
        this.spellDao = spellDao;
    }

    public List<Spell> getAllSpells() {
        return spellDao.getAllSpells();
    }
}
