SELECT name_company,user_name,id_user,administrator,password,ut.id_company FROM
 companies az JOIN usersgis ut on az.id_company=ut.id_company WHERE user_name='fd'
 AND password='fdfdf';