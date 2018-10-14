
CREATE TABLE `companies` (
   
  -- string
  `id_company` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name_company` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_company`)
   
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `companies` (
  `id_company` int(11) DEFAULT NULL,
  `name_company` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

select * from companies;
-- insert
INSERT INTO `jpa_test`.`companies`
(`id_company`,
`name_company`)
VALUES
(1,
"be");

INSERT INTO `jpa_test`.`companies`
(`id_company`,
`name_company`)
VALUES
(2,
"sky");


