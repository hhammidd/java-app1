use mmasgis;
SELECT `u`.`amministratore`, `u`.`nome_utente`, `u`.`utente_id`, `u`.`azienda_id_mmas`, 
			`u`.`ruolo_id`, `p`.`nome`, `p`.`id` 
		FROM `utente` u 
    	JOIN `ruolo` r ON `r`.`ruolo_id` = `u`.`ruolo_id` 
		JOIN `ruoli_permessi` rp ON `rp`.`ruolo_id` = `r`.`ruolo_id` 
		JOIN `permessi` p ON `p`.`id` = `rp`.`permesso_id` 
		WHERE `u`.`utente_id` = 742
			AND `u`.`nome_utente` = "beAdmin" ; 
            
            SELECT nome_azienda,nome_utente,utente_id,amministratore,password,ut.azienda_id FROM
 azienda az JOIN utente ut on az.azienda_id=ut.azienda_id WHERE nome_utente='admin' 
 AND password='8e61727ca1560d3fdbd958a8e09f6aac6f6da262';