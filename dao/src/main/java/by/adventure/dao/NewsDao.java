package by.adventure.dao;

import by.adventure.dao.common.BaseDao;
import by.adventure.entity.News;
import by.adventure.entity.NewsComment;

import java.util.List;

public interface NewsDao extends BaseDao<News> {
    News changePicture(News model, String src);

    News changeName(News model, String name);

    News changeText(News model, String text);

    List<NewsComment> getCommentsByNewsId(Long primaryKey);

    News getByName(String name);
}
