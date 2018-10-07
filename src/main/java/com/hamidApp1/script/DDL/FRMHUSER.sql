use jpa_test;

--

CREATE TABLE `FRMHUSER` (
   
  -- string
  `COD_USER` varchar(50) DEFAULT NULL,
  `NAME_USER` varchar(50) DEFAULT NULL,
   `PASSWORD_USER` varchar(100) DEFAULT NULL,
  `COD_GROUP` varchar(25) DEFAULT NULL,
  
  `STATUS`  NUMERIC ,
  
  `ROLE` varchar(40) DEFAULT NULL,
  `USRPHONE` varchar(10) DEFAULT NULL,
  `USREMAILADDR` varchar(10) DEFAULT NULL,
  `USRSHORTNAME` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- select All
select * from frmhuser; 

-- insert
INSERT INTO `jpa_test`.`frmhuser`
(`COD_USER`,
`NAME_USER`,
`PASSWORD_USER`,
`COD_GROUP`,
`STATUS`,
`ROLE`,
`USRPHONE`,
`USREMAILADDR`,
`USRSHORTNAME`)
VALUES
("HAMID",
"HAMID",
"0b14d501a594442a01c6859541bcb3e8164d183d32937b851835442f69d5c94e",
"CC",
1,
"USE1R",
"f",
"aq",
"sss");

-- findByUserCod
select * from frmhuser where COD_USER = "HAMID";

