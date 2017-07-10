package by.adventure.dao;

import by.adventure.dao.common.BaseDaoImpl;
import by.adventure.entity.ForumTopicGlobal;
import by.adventure.entity.ForumTopicSimple;
import by.adventure.entity.QForumTopicSimple;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ForumTopicGlobalDaoImpl extends BaseDaoImpl<ForumTopicGlobal> implements ForumTopicGlobalDao {
    @Override
    public ForumTopicGlobal getByName(String name) {
        return getSessionFactory().
                getCurrentSession()
                .createQuery("from ForumTopicGlobal where name=:topicName", ForumTopicGlobal.class)
                .setParameter("topicName", name)
                .getSingleResult();
    }

    @Override
    public ForumTopicGlobal changeName(ForumTopicGlobal topic, String name) {
        topic.setName(name);
        return update(topic);
    }

    @Override
    public List<ForumTopicSimple> getAllSimpleTopicsById(Long id) {
        QForumTopicSimple topic = new QForumTopicSimple("topic");
        JPAQuery<ForumTopicSimple> query = new JPAQuery<>(getSessionFactory().getCurrentSession());
        return query.select(topic).from(topic).where(topic.theme.id.eq(id)).fetchResults().getResults();
    }
}
