package by.adventure.service;

import by.adventure.dao.ForumTopicSimpleDaoImpl;
import by.adventure.entity.ForumPost;
import by.adventure.entity.ForumTopicGlobal;
import by.adventure.entity.ForumTopicSimple;
import by.adventure.service.common.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ForumTopicSimpleServiceImpl
        extends BaseServiceImpl<ForumTopicSimple, ForumTopicSimpleDaoImpl> implements ForumTopicSimpleService {
    @Override
    public ForumTopicSimple getByName(String name) {
        return getRepository().getByName(name);
    }

    @Override
    public ForumTopicSimple changeTheme(ForumTopicSimple topicSimple, ForumTopicGlobal topicGlobal) {
        return getRepository().changeTheme(topicSimple, topicGlobal);
    }

    @Override
    public List<ForumPost> getAllForumPosts(Long primaryKey) {
        return getRepository().getAllForumPosts(primaryKey);
    }

    @Override
    public ForumTopicSimple changeText(ForumTopicSimple topicSimple, String text) {
        return getRepository().changeText(topicSimple, text);
    }
}
