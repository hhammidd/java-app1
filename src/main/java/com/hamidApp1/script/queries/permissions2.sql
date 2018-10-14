-- use jpa_test
use jpa_test;

CREATE TABLE `pvtest` (
  `pv_id` int(11) ,
  `name1` varchar(25) ,
  `username` varchar(25) ,
  `password` varchar(25),
  `comune` varchar(25),
  `istat_id` int(11),
  
  PRIMARY KEY (`pv_id`)
  
  
) ENGINE=InnoDB AUTO_INCREMENT=42969 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `permissions` (
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `permissions` (
 `id_per` int(11) ,
  `name` varchar(50) ,
  `desc` varchar(50) ,
  PRIMARY KEY (`id_per`)
  
  
) ENGINE=InnoDB AUTO_INCREMENT=42969 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


CREATE TABLE `permissions` (
   
  -- string
  `id_permission` int DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `desc` varchar(50) DEFAULT NULL
   
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


use jpa_test;
INSERT INTO `jpa_test`.`permissions`
(`id_per`,
`name`,
`desc`)
VALUES
(144,
"ss",
"ddcsd");



CREATE TABLE `permissions` (
  `id_per` int(11) unsigned NOT NULL ,
  
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `desc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL

  
) ENGINE=InnoDB AUTO_INCREMENT=742 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

