package by.adventure.dao;

import by.adventure.dao.common.BaseDaoImpl;
import by.adventure.entity.QRoleOfUser;
import by.adventure.entity.RoleOfUser;
import by.adventure.entity.other.UserRole;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends BaseDaoImpl<RoleOfUser> implements RoleDao {

    @Override
    public RoleOfUser getAdmin() {
        QRoleOfUser role = new QRoleOfUser("role");
        JPAQuery<RoleOfUser> query = new JPAQuery<>(getSessionFactory().getCurrentSession());
        return query.select(role).from(role).where(role.role.eq(UserRole.ADMIN)).fetchOne();

    }

    @Override
    public RoleOfUser getUser() {
        QRoleOfUser role = new QRoleOfUser("role");
        JPAQuery<RoleOfUser> query = new JPAQuery<>(getSessionFactory().getCurrentSession());
        return query.select(role).from(role).where(role.role.eq(UserRole.USER)).fetchOne();
    }

    @Override
    public RoleOfUser getContentMaker() {
        QRoleOfUser role = new QRoleOfUser("role");
        JPAQuery<RoleOfUser> query = new JPAQuery<>(getSessionFactory().getCurrentSession());
        return query.select(role).from(role).where(role.role.eq(UserRole.CONTENT_MAKER)).fetchOne();
    }

    @Override
    public RoleOfUser getModerator() {
        QRoleOfUser role = new QRoleOfUser("role");
        JPAQuery<RoleOfUser> query = new JPAQuery<>(getSessionFactory().getCurrentSession());
        return query.select(role).from(role).where(role.role.eq(UserRole.MODERATOR)).fetchOne();
    }
}
