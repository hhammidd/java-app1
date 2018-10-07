/* mGis DB */
use farmacy_it;

 /* Create Tables */
	 /* 1. pv */

CREATE TABLE regioni_it (
    pv_id int,
    nome1 varchar(255),
    indirizzo varchar(255),
    comune int(255),
    cap int(255) 
);

/* SELECT * from Tables */
Select * from pv;

/* INSERT into Tables */
INSERT INTO pv (pv_id, nome1, indirizzo, comune , cap )
VALUES (1, "hamid", "viale puglie", 12 , 12);


 