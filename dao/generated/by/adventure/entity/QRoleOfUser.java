package by.adventure.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoleOfUser is a Querydsl query type for RoleOfUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoleOfUser extends EntityPathBase<RoleOfUser> {

    private static final long serialVersionUID = 1750678766L;

    public static final QRoleOfUser roleOfUser = new QRoleOfUser("roleOfUser");

    public final by.adventure.entity.common.QBaseEntity _super = new by.adventure.entity.common.QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final EnumPath<by.adventure.entity.other.UserRole> role = createEnum("role", by.adventure.entity.other.UserRole.class);

    public final ListPath<User, QUser> users = this.<User, QUser>createList("users", User.class, QUser.class, PathInits.DIRECT2);

    public QRoleOfUser(String variable) {
        super(RoleOfUser.class, forVariable(variable));
    }

    public QRoleOfUser(Path<? extends RoleOfUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleOfUser(PathMetadata metadata) {
        super(RoleOfUser.class, metadata);
    }

}

