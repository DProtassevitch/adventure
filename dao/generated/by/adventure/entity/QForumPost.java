package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QForumPost is a Querydsl query type for ForumPost
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QForumPost extends EntityPathBase<ForumPost> {

    private static final long serialVersionUID = 816455691L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QForumPost forumPost = new QForumPost("forumPost");

    public final QMessage _super;

    //inherited
    public final DatePath<java.time.LocalDate> dateOfCreation;

    public final QForumTopicSimple forumTopic;

    //inherited
    public final NumberPath<Long> id;

    public final NumberPath<Long> likes = createNumber("likes", Long.class);

    //inherited
    public final StringPath text;

    // inherited
    public final QUser user;

    public QForumPost(String variable) {
        this(ForumPost.class, forVariable(variable), INITS);
    }

    public QForumPost(Path<? extends ForumPost> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QForumPost(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QForumPost(PathMetadata metadata, PathInits inits) {
        this(ForumPost.class, metadata, inits);
    }

    public QForumPost(Class<? extends ForumPost> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QMessage(type, metadata, inits);
        this.dateOfCreation = _super.dateOfCreation;
        this.forumTopic = inits.isInitialized("forumTopic") ? new QForumTopicSimple(forProperty("forumTopic"), inits.get("forumTopic")) : null;
        this.id = _super.id;
        this.text = _super.text;
        this.user = _super.user;
    }

}

