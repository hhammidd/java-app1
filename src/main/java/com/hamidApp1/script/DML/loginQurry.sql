use mmasgis;
SELECT `u`.`amministratore`, `u`.`nome_utente`, `u`.`utente_id`, `u`.`azienda_id_mmas`, 
			`u`.`ruolo_id`, `p`.`nome`, `p`.`id` 
		FROM `utente` u 
    	JOIN `ruolo` r ON `r`.`ruolo_id` = `u`.`ruolo_id` 
		JOIN `ruoli_permessi` rp ON `rp`.`ruolo_id` = `r`.`ruolo_id` 
		JOIN `permessi` p ON `p`.`id` = `rp`.`permesso_id` 
		WHERE `u`.`utente_id` = 1
			AND `u`.`nome_utente` = "admin" ; 