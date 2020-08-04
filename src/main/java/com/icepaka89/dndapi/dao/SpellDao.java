package com.icepaka89.dndapi.dao;

import com.icepaka89.dndapi.model.Spell;
import java.util.List;

/**
 * Spell data contract.
 */
public interface SpellDao {
    /**
     * Get a single spell by its id.
     * @param id
     * @return
     */
    Spell getSpellById(int id);

    /**
     * Get all spells in the database.
     * @return
     */
    List<Spell> getAllSpells();
}
