
use jpa_test;

-- create
CREATE TABLE `permissions` (
  `id_permission` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `desc` varchar(250)  DEFAULT NULL,
  PRIMARY KEY (`id_permission`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
-- insert some tasks
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('1', 'Selezione - Cerca Territorio', 'Ricerca UTB nell\'albero di selezione dei territori');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('2', 'Selezione - Comprimi Albero', 'Comprimi l\'albero di selezione dei territori');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('3', 'Selezione - Censimenti', 'Accedi alla scelta del censimento');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('4', 'Selezione - Deseleziona Tutto', 'Deseleziona tutti i territori selezionati sulla mappa');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('5', 'Selezione - UTB', 'Possibilità di selezionare i territori');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('6', 'Anagrafica - Geo Visualizzazione', 'Permette di visualizzare sulla cartina geografica la dislocazione dei punti vendita');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('7', 'Anagrafica - Salva', 'Consente di salvare le modifiche nella scheda anagrafica');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('8', 'Anagrafica - Salva PDF', 'Consente di salvare in PDF le modifiche nella scheda anagrafica');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('9', 'Anagrafica - Filtri', 'Filtra anagrafiche');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('10', 'Anagrafica - Cerca', 'Ricerca anagrafica tra i risultati');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('11', 'Analisi - Potenziali', 'Visualizza statistiche punti vendita');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('12', 'Analisi - Marche', 'Visualizza statistiche marche');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('13', 'Analisi - Parametri', 'Visualizza statistiche parametri');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('14', 'Analisi - Servizi', 'Visualizza statistiche in base ai servizi');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('15', 'Analisi - Fatturati', 'Visualizza statistiche in base ai fatturati');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('16', 'Analisi - Zone Analysis', 'Consente accesso alla parte di creazione degli scenari e analisi delle zone');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('17', 'Excel - Anagrafiche', 'Esporta elenco anagrafiche in formato Excel');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('18', 'Excel - Analisi Fatturati', 'Esporta statistiche fatturati in formato Excel');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('19', 'Excel - Analisi Potenziali', 'Esporta statistiche potenziali in formato Excel');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('20', 'Excel - Analisi Parametri', 'Esporta statistiche parametri in formato Excel');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('21', 'Excel - Analisi Marche', 'Esporta statistiche marche in formato Excel');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('22', 'Excel - Analisi Servizi', 'Esporta statistiche marche in formato Excel');
INSERT INTO `jpa_test`.`permissions` (`id_permission`, `name`, `desc`) VALUES ('30', 'Admin - Gestione Utenti', 'Consente di gestire gli utenti');





-- select all
select * from permissions;