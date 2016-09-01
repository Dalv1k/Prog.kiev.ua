package net.ukr.p454.task3alter.DAO;

import net.ukr.p454.task3alter.*;

/**
 * Created by vkekukh on 01.09.2016.
 */
public interface IGroupDAO {

    void saveGroup(Group group);
    Group loadGroup();
}
