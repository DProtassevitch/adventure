package by.adventure.service;

import by.adventure.entity.Hero;
import by.adventure.entity.HeroAbility;
import by.adventure.entity.other.HeroRole;
import by.adventure.service.common.BaseService;

import java.util.List;

public interface HeroService extends BaseService<Hero> {

    List<HeroAbility> getAllAbilities(Long primaryKey);

    Hero changeName(Hero hero, String name);

    Hero changeRole(Hero hero, HeroRole heroRole);

    Hero changePicture(Hero hero, String srcPicture);

    Hero getByName(String name);
}
