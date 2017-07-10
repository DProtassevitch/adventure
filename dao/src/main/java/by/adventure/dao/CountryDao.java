package by.adventure.dao;

import by.adventure.dao.common.BaseDao;
import by.adventure.entity.Country;

public interface CountryDao extends BaseDao<Country> {
    Country findByName(String name);
}