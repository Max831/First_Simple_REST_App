CREATE TABLE IF NOT EXISTS customers(
    id BIGINT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    address VARCHAR(1000) NOT NULL,
    budget DECIMAL NOT NULL
);
CREATE SEQUENCE customers_id_seq START WITH 2 INCREMENT BY 1;