# D&D API
This project is a work in progress, the goal is to make an API for generating characters, as well as a comprehensive source for retrieving information for future projects.

# Database setup

There are two included SQL files to migrate the database: 
* `dnddb.sql` Creates the `dnd` database, and migrates tables for classes and spells. This includes a link table to get the spells available for a class.
* `dnd5e-sre-db.sql` Creates tables for races, proficiencies, and link tables for the proficiency choices.