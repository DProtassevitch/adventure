package by.adventure.service;

import by.adventure.entity.NewsComment;
import by.adventure.service.common.BaseService;

public interface NewsCommentService extends BaseService<NewsComment> {
    NewsComment changeText(NewsComment comment, String text);
}
