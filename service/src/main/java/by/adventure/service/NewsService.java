package by.adventure.service;

import by.adventure.entity.News;
import by.adventure.entity.NewsComment;
import by.adventure.service.common.BaseService;

import java.util.List;

public interface NewsService extends BaseService<News> {
    News changePicture(News model, String src);

    News changeName(News model, String name);

    News changeText(News model, String text);

    List<NewsComment> getCommentsByNewsId(Long primaryKey);

    News getByName(String name);
}
