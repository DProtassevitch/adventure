package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNewsComment is a Querydsl query type for NewsComment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNewsComment extends EntityPathBase<NewsComment> {

    private static final long serialVersionUID = 1736356918L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNewsComment newsComment = new QNewsComment("newsComment");

    public final QMessage _super;

    //inherited
    public final DatePath<java.time.LocalDate> dateOfCreation;

    //inherited
    public final NumberPath<Long> id;

    public final NumberPath<Long> likeFromOthersUsers = createNumber("likeFromOthersUsers", Long.class);

    public final QNews news;

    //inherited
    public final StringPath text;

    // inherited
    public final QUser user;

    public QNewsComment(String variable) {
        this(NewsComment.class, forVariable(variable), INITS);
    }

    public QNewsComment(Path<? extends NewsComment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNewsComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNewsComment(PathMetadata metadata, PathInits inits) {
        this(NewsComment.class, metadata, inits);
    }

    public QNewsComment(Class<? extends NewsComment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QMessage(type, metadata, inits);
        this.dateOfCreation = _super.dateOfCreation;
        this.id = _super.id;
        this.news = inits.isInitialized("news") ? new QNews(forProperty("news"), inits.get("news")) : null;
        this.text = _super.text;
        this.user = _super.user;
    }

}

