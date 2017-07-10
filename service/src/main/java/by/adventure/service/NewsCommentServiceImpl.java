package by.adventure.service;


import by.adventure.dao.NewsCommentDaoImpl;
import by.adventure.entity.NewsComment;
import by.adventure.service.common.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NewsCommentServiceImpl
        extends BaseServiceImpl<NewsComment, NewsCommentDaoImpl> implements NewsCommentService{
    @Override
    public NewsComment changeText(NewsComment comment, String text) {
        return getRepository().changeText(comment, text);
    }
}
