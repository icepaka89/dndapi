package com.icepaka89.dndapi.model;

/**
 * Model class for the DnD5e spells.
 *
 * @author danielgomm
 */
public class Spell {
    public final int spell_id;
    public final String spell_name;
    public final int spell_level;
    public final String spell_type;
    public final String casting_time;
    public final String spell_range;
    public final String components;
    public final String duration;
    public final String description;
    public final String higher_levels;

    /**
     * Construct a new Spell bean, all properties are initialized with the constructor argument values and are final.
     * @param spell_id
     * @param spell_name
     * @param spell_level
     * @param spell_type
     * @param casting_time
     * @param spell_range
     * @param components
     * @param duration
     * @param description
     * @param higher_levels
     */
    public Spell(
            int spell_id,
            String spell_name,
            int spell_level,
            String spell_type,
            String casting_time,
            String spell_range,
            String components,
            String duration,
            String description,
            String higher_levels
    ) {
        this.spell_id = spell_id;
        this.spell_name = spell_name;
        this.spell_level = spell_level;
        this.spell_type = spell_type;
        this.casting_time = casting_time;
        this.spell_range = spell_range;
        this.components = components;
        this.duration = duration;
        this.description = description;
        this.higher_levels = higher_levels;
    }
}
