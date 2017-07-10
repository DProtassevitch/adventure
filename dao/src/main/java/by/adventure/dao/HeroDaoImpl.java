package by.adventure.dao;

import by.adventure.dao.common.BaseDaoImpl;
import by.adventure.entity.Hero;
import by.adventure.entity.HeroAbility;
import by.adventure.entity.QHeroAbility;
import by.adventure.entity.other.HeroRole;
import com.querydsl.jpa.impl.JPAQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HeroDaoImpl extends BaseDaoImpl<Hero> implements HeroDao {

    @Override
    public List<HeroAbility> getAllAbilities(Long primaryKey) {
        QHeroAbility ability = new QHeroAbility("ability");
        JPAQuery<HeroAbility> query = new JPAQuery<>(getSessionFactory().getCurrentSession());
        return query.select(ability)
                .from(ability)
                .where(ability.hero.id.eq(primaryKey))
                .fetchResults()
                .getResults();
    }

    @Override
    public Hero changeName(Hero hero, String name) {
        hero.setName(name);
        return update(hero);
    }

    @Override
    public Hero changeRole(Hero hero, HeroRole heroRole) {
        hero.setRole(heroRole);
        return update(hero);
    }

    @Override
    public Hero changePicture(Hero hero, String srcPicture) {
        hero.setPassToPicture(srcPicture);
        return update(hero);
    }

    @Override
    public Hero getByName(String name) {
        Session session = getSessionFactory().getCurrentSession();
        return session.createQuery("select h from Hero h where h.name=:heroName", Hero.class)
                .setParameter("heroName", name)
                .getResultList()
                .get(0);
    }
}
