use jpa_test;

-- create
CREATE TABLE `permissions` (
  `id_permission` int(11) unsigned NOT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `desc` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_permission`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
-- insert some
INSERT INTO `jpa_test`.`permissions`
(`id_permission`,
`name`,
`desc`)
VALUES
(1,
"select_total",
"can select All things");

INSERT INTO `jpa_test`.`permissions`
(`id_permission`,
`name`,
`desc`)
VALUES
(2,
"save",
"can save All things");

INSERT INTO `jpa_test`.`permissions`
(`id_permission`,
`name`,
`desc`)
VALUES
(3,
"delete",
"can delete All things");


-- select all
select * from permissions;