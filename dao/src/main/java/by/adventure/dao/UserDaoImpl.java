package by.adventure.dao;

import by.adventure.dao.common.BaseDaoImpl;
import by.adventure.entity.*;
import by.adventure.entity.other.Address;
import com.querydsl.jpa.impl.JPAQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @Override
    public User changePicture(User model, String src) {
        model.setSrcAvatar(src);
        getSessionFactory().getCurrentSession().update(model);
        return model;
    }

    @Override
    public User changeNickName(User model, String nickName) {
        model.setNickName(nickName);
        getSessionFactory().getCurrentSession().update(model);
        return model;
    }

    @Override
    public User changePassword(User model, String password) {
        model.setPassword(password);
        getSessionFactory().getCurrentSession().update(model);
        return model;
    }

    @Override
    public User changeName(User model, String name) {
        model.setName(name);
        getSessionFactory().getCurrentSession().update(model);
        return model;
    }

    @Override
    public User changeCountry(User model, String country) {
        Address address = model.getAddress();
        address.setCountry(country);
        model.setAddress(address);
        getSessionFactory().getCurrentSession().update(model);
        return model;
    }

    @Override
    public User changeCity(User model, String city) {
        Address address = model.getAddress();
        address.setCity(city);
        model.setAddress(address);
        getSessionFactory().getCurrentSession().update(model);
        return model;
    }

    @Override
    public List<Topic> getCreatedTopicsById(Long primaryKey) {
        QTopic topic = new QTopic("myTopic");
        JPAQuery<Topic> query = new JPAQuery<>(getSessionFactory().getCurrentSession());
        query.select(topic).from(topic).where(topic.user.id.eq(primaryKey));
        return query.fetchResults().getResults();
    }

    @Override
    public List<RoleOfUser> getAllRolles(Long primaryKey) {
        Session session = getSessionFactory().getCurrentSession();
        User user = session.find(User.class, primaryKey);
        return user.getRoleOfUser();
    }

    @Override
    public User getByLogin(String login) {
        QUser user = new QUser("user");
        JPAQuery<User> query = new JPAQuery<>(getSessionFactory().getCurrentSession());
        return query.select(user).from(user).where(user.name.eq(login)).fetchOne();

    }
}
