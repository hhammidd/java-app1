use jpa_test;

--


CREATE TABLE `usersgis` (
  `id_user` int(11) unsigned NOT NULL ,
  `id_company` int(11) unsigned NOT NULL,
  `id_company_mGis` int(11) unsigned NOT NULL,
  `user_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `id_role` int(11) unsigned DEFAULT NULL,
  `administrator` int(11) DEFAULT NULL,
  `users_ins` int(11) unsigned NOT NULL,
  `id_clRole` int(11) unsigned DEFAULT NULL
  
) ENGINE=InnoDB AUTO_INCREMENT=742 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 
select * from usersgis;

-- inserrt
INSERT INTO `jpa_test`.`usersgis`
(`id_user`,
`id_company`,
`id_company_mGis`,
`user_name`,
`password`,
`id_role`,
`administrator`,
`users_ins`,
`id_clRole`)
VALUES
(1,
1,
111,
"hamid",
"pass1",
1,
1,
1,
1);

INSERT INTO `jpa_test`.`usersgis`
(`id_user`,
`id_company`,
`id_company_mGis`,
`user_name`,
`password`,
`id_role`,
`administrator`,
`users_ins`,
`id_clRole`)
VALUES
(2,
2,
111,
"maroil",
"pass2",
1,
1,
1,
1);
