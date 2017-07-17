package by.adventure.util;

import by.adventure.entity.*;
import by.adventure.entity.other.Address;
import by.adventure.entity.other.UserRole;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public final class TestDataImporte {

    public void importTestData(Session session) {

        User userQwerty = saveUser(session, "Qwerty", "Qwerty", "AmazingQwerty");
        User userOlfourd = saveUser(session, "Olfourd", "Qwerty", "AmazingOlfourd");
        User userDeGriz = saveUser(session, "DeGriz", "Qwerty", "AmazingDeGriz");

        News news = saveNews(session, "This is the first News!", "hi", userOlfourd);
        saveNewsCommentTest(session, "hello from test", userOlfourd, news);
        saveNewsCommentTest(session, "hi all", userOlfourd, news);

        ForumTopicGlobal topicGlobal = saveGlobalTopic(session, "global topic");
        ForumTopicGlobal forumTopicGlobal = saveGlobalTopic(session, "global topic qwerty");

        ForumTopicSimple topicSimple = saveSimpleTopic(session, "simple topic",
                "what is it?", userDeGriz, topicGlobal);
        saveForumPost(session, "this is comment", userDeGriz, topicSimple);
        saveForumPost(session, "qwerty", userDeGriz, topicSimple);

    }

    private ForumPost saveForumPost(Session session, String text, User user, ForumTopicSimple topic) {
        ForumPost forumPost = new ForumPost(text, user, topic);
        session.save(forumPost);
        return forumPost;
    }

    private ForumTopicSimple saveSimpleTopic(Session session, String name, String text, User user,
                                             ForumTopicGlobal topicGlobal) {
        ForumTopicSimple topicSimple = new ForumTopicSimple(name, text, user, topicGlobal);
        session.save(topicSimple);
        return topicSimple;
    }

    private ForumTopicGlobal saveGlobalTopic(Session session, String name) {
        ForumTopicGlobal topicGlobal = new ForumTopicGlobal(name);
        session.save(topicGlobal);
        return topicGlobal;
    }

    private NewsComment saveNewsCommentTest(Session session, String text, User user, News news) {
        NewsComment comment = new NewsComment(text, user, news);
        session.save(comment);
        return comment;
    }

    private News saveNews(Session session, String name, String text, User user) {
        News news = new News(name, text, user);
        session.save(news);
        return news;
    }

    private User saveUser(Session session, String login, String password, String nickName) {
        User user = new User(login, password, nickName);
        List<RoleOfUser> roles = Arrays.asList(
                new RoleOfUser(UserRole.USER),
                new RoleOfUser(UserRole.ADMIN));
        user.setRoleOfUser(roles);
        user.setAddress(new Address("Belarus", "Minsk"));
        session.save(user);
        return user;
    }

}
