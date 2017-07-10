package by.adventure.dao;

import by.adventure.dao.common.BaseDao;
import by.adventure.entity.ForumPost;
import by.adventure.entity.ForumTopicGlobal;
import by.adventure.entity.ForumTopicSimple;

import java.util.List;

public interface ForumTopicSimpleDao extends BaseDao<ForumTopicSimple> {

    ForumTopicSimple getByName(String name);

    ForumTopicSimple changeTheme(ForumTopicSimple topicSimple, ForumTopicGlobal topicGlobal);

    List<ForumPost> getAllForumPosts(Long primaryKey);

    ForumTopicSimple changeText(ForumTopicSimple topicSimple, String text);
}
