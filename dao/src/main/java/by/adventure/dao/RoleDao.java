package by.adventure.dao;

import by.adventure.dao.common.BaseDao;
import by.adventure.entity.RoleOfUser;

public interface RoleDao extends BaseDao<RoleOfUser> {
    RoleOfUser getAdmin();
    RoleOfUser getUser();
    RoleOfUser getContentMaker();
    RoleOfUser getModerator();



}
