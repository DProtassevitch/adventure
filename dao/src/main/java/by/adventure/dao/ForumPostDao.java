package by.adventure.dao;

import by.adventure.dao.common.BaseDao;
import by.adventure.entity.ForumPost;


public interface ForumPostDao extends BaseDao<ForumPost> {
    ForumPost changeText(ForumPost post, String text);
}
