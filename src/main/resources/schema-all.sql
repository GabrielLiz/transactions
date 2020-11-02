DROP TABLE operations IF EXISTS;

create table operations (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    reference integer,
    iban VARCHAR(50),
    transaction_date VARCHAR(50),
    amount DOUBLE,
    fee DOUBLE,
    description VARCHAR(50)
);

INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44554,47647457, 'DE27100777770209299700', '2020-10-29',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44555,2345345, 'DE271006123120209299700', '2020-10-28',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44556,9764567, 'DE27100131233209299700', '2020-11-03',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44557,1231231, 'DE271007123145150209299700', '2020-10-31',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44558,2342342, 'DE27100345345209299700', '2020-11-02',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44559,34982, 'DE271001344234209299700', '2020-11-05',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44560,9634149, 'DE271005672340209299700', '2020-10-16',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44562,4789211, 'DE271007623424209299700', '2020-10-29',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (44564,56234444, 'DE271002424560209299700', '2020-10-29',500.0,2.0,'Online Shopping');
INSERT INTO operations (id, reference, iban, transaction_date,amount,fee,description) VALUES (24557,47647456, 'DE27100777770209299700', '2020-10-29',300.0,2.0,'Online Shopping');
