package by.adventure.service;

import by.adventure.entity.ForumTopicGlobal;
import by.adventure.entity.ForumTopicSimple;
import by.adventure.service.common.BaseService;

import java.util.List;

public interface ForumTopicGlobalService extends BaseService<ForumTopicGlobal> {
    ForumTopicGlobal getByName(String name);

    ForumTopicGlobal changeName(ForumTopicGlobal topic, String name);

    List<ForumTopicSimple> getAllSimpleTopicsById(Long id);
}
