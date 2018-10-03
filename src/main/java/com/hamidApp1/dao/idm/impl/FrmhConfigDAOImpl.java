package com.hamidApp1.dao.idm.impl;

import com.hamidApp1.dao.idm.FrmhConfigDAO;
import org.apache.commons.lang.StringUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class FrmhConfigDAOImpl implements FrmhConfigDAO {
    private Connection dataConnection;
    public FrmhConfigDAOImpl(Connection dataConnection) {
        this.dataConnection = dataConnection;
    }

    @Override
    public Map<String, String> getConfigurationsByFunction(String function) throws SQLException {
        Map<String, String> configs = new HashMap<>();
        String sql = "SELECT FRMHCFG_DATA_TYPE, FRMHCFG_DATA_VALUE FROM FRMHCONFIG WHERE FRMHCFG_ABI = '99999' AND FRMHCFG_FUNCTION = '"
                + function + "'";
        try (Statement st = dataConnection.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                configs.put(StringUtils.trimToEmpty(rs.getString("FRMHCFG_DATA_TYPE")).toUpperCase(),
                        StringUtils.trimToEmpty(rs.getString("FRMHCFG_DATA_VALUE")));
            }
        } finally {
            if (dataConnection != null) {
                dataConnection.close();
            }
        }
        return configs;
    }
}
