package by.adventure.dao;

import by.adventure.dao.common.BaseDaoImpl;
import by.adventure.entity.HeroAbility;
import org.springframework.stereotype.Repository;

@Repository
public class HeroAbilityDaoImpl extends BaseDaoImpl<HeroAbility> implements HeroAbilityDao {
    @Override
    public HeroAbility changeName(HeroAbility ability, String name) {
        ability.setName(name);
        return update(ability);
    }

    @Override
    public HeroAbility changePicture(HeroAbility ability, String src) {
        ability.setPassToImg(src);
        return update(ability);
    }

    @Override
    public HeroAbility changeVideo(HeroAbility ability, String src) {
        ability.setPassToVideo(src);
        return update(ability);
    }

    @Override
    public HeroAbility getByName(String name) {
        return getSessionFactory()
                .getCurrentSession()
                .createQuery("select a from HeroAbility a where a.name=:abilityName", HeroAbility.class)
                .setParameter("abilityName", name)
                .getSingleResult();
    }
}
