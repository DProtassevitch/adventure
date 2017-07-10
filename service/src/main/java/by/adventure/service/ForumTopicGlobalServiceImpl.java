package by.adventure.service;

import by.adventure.dao.ForumTopicGlobalDaoImpl;
import by.adventure.entity.ForumTopicGlobal;
import by.adventure.entity.ForumTopicSimple;
import by.adventure.service.common.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ForumTopicGlobalServiceImpl
        extends BaseServiceImpl<ForumTopicGlobal, ForumTopicGlobalDaoImpl> implements ForumTopicGlobalService{
    @Override
    public ForumTopicGlobal getByName(String name) {
        return getRepository().getByName(name);
    }

    @Override
    public ForumTopicGlobal changeName(ForumTopicGlobal topic, String name) {
        return getRepository().changeName(topic, name);
    }

    @Override
    public List<ForumTopicSimple> getAllSimpleTopicsById(Long id) {
        return getRepository().getAllSimpleTopicsById(id);
    }
}
