use k1_farmacie_it;
SELECT  SQL_CALC_FOUND_ROWS tcp.primario, IF(`tcp`.`primario`=1, rpp.valore, 0) AS potenziale, 
   pv.cod_cliente, pv.pv_id, pv.codice AS cod_mmas, pv.nome1 AS ragione_sociale, pv.indirizzo,
   pv.cap, pv.comune, pv.provincia, pv.tel1 AS telefono, pv.tel2 AS telefono2, 
   pv.tel3 AS telefono3, pv.cf_pi AS codice_fiscale, pv.nome2 AS titolare, pv.fax, 
   pv.email, pv.sito, IF(`pv`.`cliente`=0, 'No', 'Si') AS cliente, pv.mod_data, pv.note, 
   pv.coords 
  FROM pv 
  LEFT JOIN rel_pv_pot rpp ON rpp.pv_id = pv.pv_id 
  LEFT JOIN tc_clpot tcp ON tcp.tc_clpot_id = rpp.tc_clpot_id 
  
        
        LEFT JOIN rel_pv_par rpa ON rpa.pv_id = pv.pv_id
        
        
        WHERE ( pv.istat_id IN (SELECT i.id FROM mmasgis.istat_it i JOIN mmasgis.regioni_it r ON i.regione_id = r.id  
  
             JOIN mmasgis.province_it p ON i.provincia_id = p.id  

             JOIN mmasgis.comuni_it o ON i.comune_id = o.id WHERE r.codice IN (15) OR p.codice IN (15,16) OR o.codice IN (15,16)) AND pv.tc_stato_id = 1);