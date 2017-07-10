package by.adventure.dao;

import by.adventure.dao.common.BaseDao;
import by.adventure.entity.Hero;
import by.adventure.entity.HeroAbility;
import by.adventure.entity.other.HeroRole;

import java.util.List;

public interface HeroDao extends BaseDao<Hero> {

    List<HeroAbility> getAllAbilities(Long primaryKey);

    Hero changeName(Hero hero, String name);

    Hero changeRole(Hero hero, HeroRole heroRole);

    Hero changePicture(Hero hero, String srcPicture);

    Hero getByName(String name);
}
