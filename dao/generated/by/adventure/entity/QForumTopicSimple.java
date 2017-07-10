package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QForumTopicSimple is a Querydsl query type for ForumTopicSimple
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QForumTopicSimple extends EntityPathBase<ForumTopicSimple> {

    private static final long serialVersionUID = 1629316598L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QForumTopicSimple forumTopicSimple = new QForumTopicSimple("forumTopicSimple");

    public final QTopic _super;

    public final ListPath<ForumPost, QForumPost> containedPosts = this.<ForumPost, QForumPost>createList("containedPosts", ForumPost.class, QForumPost.class, PathInits.DIRECT2);

    //inherited
    public final DatePath<java.time.LocalDate> dateOfCreation;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    //inherited
    public final StringPath text;

    public final QForumTopicGlobal theme;

    // inherited
    public final QUser user;

    public QForumTopicSimple(String variable) {
        this(ForumTopicSimple.class, forVariable(variable), INITS);
    }

    public QForumTopicSimple(Path<? extends ForumTopicSimple> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QForumTopicSimple(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QForumTopicSimple(PathMetadata metadata, PathInits inits) {
        this(ForumTopicSimple.class, metadata, inits);
    }

    public QForumTopicSimple(Class<? extends ForumTopicSimple> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QTopic(type, metadata, inits);
        this.dateOfCreation = _super.dateOfCreation;
        this.id = _super.id;
        this.name = _super.name;
        this.text = _super.text;
        this.theme = inits.isInitialized("theme") ? new QForumTopicGlobal(forProperty("theme")) : null;
        this.user = _super.user;
    }

}

