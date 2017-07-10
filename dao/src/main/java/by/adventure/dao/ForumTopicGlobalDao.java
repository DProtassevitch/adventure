package by.adventure.dao;

import by.adventure.dao.common.BaseDao;
import by.adventure.entity.ForumTopicGlobal;
import by.adventure.entity.ForumTopicSimple;

import java.util.List;

public interface ForumTopicGlobalDao extends BaseDao<ForumTopicGlobal> {
    ForumTopicGlobal getByName(String name);

    ForumTopicGlobal changeName(ForumTopicGlobal topic, String name);

    List<ForumTopicSimple> getAllSimpleTopicsById(Long id);
}
