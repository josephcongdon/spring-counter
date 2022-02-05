use counter_db;
DROP TABLE IF EXISTS counter;
CREATE TABLE IF NOT EXISTS counter(
    id int NOT NULL AUTO_INCREMENT,
    counter int NOT NULL
    );
