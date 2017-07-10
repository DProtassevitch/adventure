package by.adventure.service;

import by.adventure.entity.ForumPost;
import by.adventure.entity.ForumTopicGlobal;
import by.adventure.entity.ForumTopicSimple;
import by.adventure.service.common.BaseService;

import java.util.List;

public interface ForumTopicSimpleService extends BaseService<ForumTopicSimple> {

    ForumTopicSimple getByName(String name);

    ForumTopicSimple changeTheme(ForumTopicSimple topicSimple, ForumTopicGlobal topicGlobal);

    List<ForumPost> getAllForumPosts(Long primaryKey);

    ForumTopicSimple changeText(ForumTopicSimple topicSimple, String text);
}
