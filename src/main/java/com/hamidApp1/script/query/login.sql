SELECT `u`.`administrator`, `u`.`user_name`, `u`.`id_user`, `u`.`id_company_mGis`,
			`u`.`id_role`, `p`.`name`, `p`.`id_permission`
		FROM `usersgis` u
    	JOIN `rules` r ON `r`.`id_rule` = `u`.`id_role`
		JOIN `rules_permissions` rp ON `rp`.`id_rule` = `r`.`id_rule`
		JOIN `permissions` p ON `p`.`id_permission` = `rp`.`id_permissions`