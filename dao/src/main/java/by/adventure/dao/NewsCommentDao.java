package by.adventure.dao;

import by.adventure.dao.common.BaseDao;
import by.adventure.entity.NewsComment;

public interface NewsCommentDao extends BaseDao<NewsComment> {
    NewsComment changeText(NewsComment comment, String text);
}
