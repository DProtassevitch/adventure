package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QForumTopicGlobal is a Querydsl query type for ForumTopicGlobal
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QForumTopicGlobal extends EntityPathBase<ForumTopicGlobal> {

    private static final long serialVersionUID = 1288583143L;

    public static final QForumTopicGlobal forumTopicGlobal = new QForumTopicGlobal("forumTopicGlobal");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    public final ListPath<ForumTopicSimple, QForumTopicSimple> containedTopics = this.<ForumTopicSimple, QForumTopicSimple>createList("containedTopics", ForumTopicSimple.class, QForumTopicSimple.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QForumTopicGlobal(String variable) {
        super(ForumTopicGlobal.class, forVariable(variable));
    }

    public QForumTopicGlobal(Path<? extends ForumTopicGlobal> path) {
        super(path.getType(), path.getMetadata());
    }

    public QForumTopicGlobal(PathMetadata metadata) {
        super(ForumTopicGlobal.class, metadata);
    }

}

