CREATE TABLE IF NOT EXISTS sportsmans
(
    id          BIGSERIAL PRIMARY KEY ,
    name        VARCHAR(200) NOT NULL ,
    surname     VARCHAR(200) NOT NULL ,
    patronymic  VARCHAR(200) NOT NULL ,
    dob         DATE NOT NULL
);