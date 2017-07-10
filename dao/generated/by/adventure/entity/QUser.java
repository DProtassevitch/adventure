package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1682380063L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    public final by.adventure.entity.other.QAddress address;

    public final ListPath<Topic, QTopic> createdTopics = this.<Topic, QTopic>createList("createdTopics", Topic.class, QTopic.class, PathInits.DIRECT2);

    public final StringPath firstName = createString("firstName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath mail = createString("mail");

    public final ListPath<Message, QMessage> messages = this.<Message, QMessage>createList("messages", Message.class, QMessage.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath nickName = createString("nickName");

    public final StringPath password = createString("password");

    public final ListPath<RoleOfUser, QRoleOfUser> roleOfUser = this.<RoleOfUser, QRoleOfUser>createList("roleOfUser", RoleOfUser.class, QRoleOfUser.class, PathInits.DIRECT2);

    public final StringPath srcAvatar = createString("srcAvatar");

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUser(PathMetadata metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new by.adventure.entity.other.QAddress(forProperty("address")) : null;
    }

}

