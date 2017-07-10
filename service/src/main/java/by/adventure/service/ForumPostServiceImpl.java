package by.adventure.service;

import by.adventure.dao.ForumPostDaoIml;
import by.adventure.entity.ForumPost;
import by.adventure.service.common.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ForumPostServiceImpl extends BaseServiceImpl<ForumPost, ForumPostDaoIml> implements ForumPostService {
    @Override
    public ForumPost changeText(ForumPost post, String text) {
        return getRepository().changeText(post, text);
    }
}
