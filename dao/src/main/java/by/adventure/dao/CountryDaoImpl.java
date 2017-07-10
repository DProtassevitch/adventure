package by.adventure.dao;

import by.adventure.entity.Country;
import by.adventure.dao.common.BaseDaoImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by root on 3.7.17.
 */

@Repository
public class CountryDaoImpl extends BaseDaoImpl<Country> implements CountryDao {

    @Override
    public Country findByName(String name) {
        List<Country> countryList = getSessionFactory().getCurrentSession()
                .createQuery("select u from Country u where u.country_name=:name", Country.class)
                .setParameter("name", name)
                .getResultList();
        return countryList.size() > 0 ? countryList.get(0) : null;
    }
}
