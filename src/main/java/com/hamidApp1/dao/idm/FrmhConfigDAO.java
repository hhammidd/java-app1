package com.hamidApp1.dao.idm;

import java.sql.SQLException;
import java.util.Map;

public interface FrmhConfigDAO {
    public abstract Map<String, String> getConfigurationsByFunction(String function) throws SQLException;
}
