/**
 * @author Sanket Mathur
 * @author Nouf Almutairi (If she is ready to work on it, my fortune)
 *
 * @date 17 Aug 2018
 *
 * Company: YHC
 *
 * This file is the Holy Grail of this application
 */

--
-- Databse `yhcDatabase`
--

DROP DATABASE IF EXISTS yhcDatabase;
CREATE DATABASE IF NOT EXISTS yhcDatabase;
USE yhcDatabase;

-- -------------------------------------------------

--
-- Table structure for table `User`
--

CREATE TABLE yhcDatabase.User (
    id VARCHAR(20),
    email VARCHAR(30) UNIQUE NOT NULL,
    firstname CHAR(50),
    lastname CHAR(50),
    role CHAR(20) NOT NULL,
    salt CHAR(20) NOT NULL,
    password CHAR(128) NOT NULL,
    active CHAR(1) DEFAULT 'N',
    PRIMARY KEY (id)
);