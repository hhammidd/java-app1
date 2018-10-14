use jpa_test;

CREATE TABLE `istat_it` (
  `id` int(11) unsigned NOT NULL,
  `id_region` int(11) unsigned NOT NULL,
  `id_province` int(11) unsigned NOT NULL,
  `id_comune` int(11) unsigned NOT NULL,
  `date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`),
  UNIQUE KEY `comune_id` (`id_comune`)
  
) ENGINE=InnoDB AUTO_INCREMENT=42969 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- select
select * from istat_it;

-- insert

