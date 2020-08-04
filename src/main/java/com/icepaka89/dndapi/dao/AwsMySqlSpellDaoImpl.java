package com.icepaka89.dndapi.dao;

import com.icepaka89.dndapi.model.Spell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Spell data access object for the live AWS RDS (MySQL) database. The database was made with aws free tier on
 * 2020-08-04, no guarantee it's still up, but the SQL to migrate the database is included in the main/resources
 * directory.
 *
 * @author danielgomm
 */
@Repository("mysql_spell")
public class AwsMySqlSpellDaoImpl implements SpellDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Maps rows from the dnd5_spells database into <b>Spell</b> objects.
     */
    private static class SpellRowMapper implements RowMapper<Spell> {
        @Override
        public Spell mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Spell(
                    resultSet.getInt("spell_id"),
                    resultSet.getString("spell_name"),
                    resultSet.getInt("spell_level"),
                    resultSet.getString("spell_type"),
                    resultSet.getString("casting_time"),
                    resultSet.getString("spell_range"),
                    resultSet.getString("components"),
                    resultSet.getString("duration"),
                    resultSet.getString("description"),
                    resultSet.getString("higher_levels")
            );
        }
    }

    /**
     * Gets a single <b>Spell</b> from the database by its integer id.
     * @param id
     * @return
     */
    @Override
    public Spell getSpellById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM dnd5_spells WHERE spell_id=?", new SpellRowMapper(), id);
    }

    /**
     * Gets all spells in the database as a <b>List</b>.
     * @return
     */
    @Override
    public List<Spell> getAllSpells() {
        return jdbcTemplate.query("SELECT * FROM dnd5_spells", new SpellRowMapper());
    }
}
