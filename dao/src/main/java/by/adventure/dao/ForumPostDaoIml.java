package by.adventure.dao;

import by.adventure.dao.common.BaseDaoImpl;
import by.adventure.entity.ForumPost;
import org.springframework.stereotype.Repository;

@Repository
public class ForumPostDaoIml extends BaseDaoImpl<ForumPost> implements ForumPostDao{
    @Override
    public ForumPost changeText(ForumPost post, String text) {
        post.setText(text);
        return update(post);
    }
}
