package by.adventure.dao;

import by.adventure.dao.common.BaseDaoImpl;
import by.adventure.entity.NewsComment;
import org.springframework.stereotype.Repository;

@Repository
public class NewsCommentDaoImpl extends BaseDaoImpl<NewsComment> implements NewsCommentDao {

    @Override
    public NewsComment changeText(NewsComment comment, String text) {
        comment.setText(text);
        return update(comment);
    }
}
