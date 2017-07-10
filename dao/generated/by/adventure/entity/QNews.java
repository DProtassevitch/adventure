package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNews is a Querydsl query type for News
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNews extends EntityPathBase<News> {

    private static final long serialVersionUID = -1682601495L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNews news = new QNews("news");

    public final QTopic _super;

    public final ListPath<NewsComment, QNewsComment> containedComments = this.<NewsComment, QNewsComment>createList("containedComments", NewsComment.class, QNewsComment.class, PathInits.DIRECT2);

    //inherited
    public final DatePath<java.time.LocalDate> dateOfCreation;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    public final StringPath srcPicture = createString("srcPicture");

    //inherited
    public final StringPath text;

    // inherited
    public final QUser user;

    public QNews(String variable) {
        this(News.class, forVariable(variable), INITS);
    }

    public QNews(Path<? extends News> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNews(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNews(PathMetadata metadata, PathInits inits) {
        this(News.class, metadata, inits);
    }

    public QNews(Class<? extends News> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QTopic(type, metadata, inits);
        this.dateOfCreation = _super.dateOfCreation;
        this.id = _super.id;
        this.name = _super.name;
        this.text = _super.text;
        this.user = _super.user;
    }

}

