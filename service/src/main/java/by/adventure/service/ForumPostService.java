package by.adventure.service;

import by.adventure.entity.ForumPost;
import by.adventure.service.common.BaseService;

public interface ForumPostService extends BaseService<ForumPost> {
    ForumPost changeText(ForumPost post, String text);
}
