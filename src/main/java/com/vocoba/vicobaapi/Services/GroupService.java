package com.vocoba.vicobaapi.Services;

import com.vocoba.vicobaapi.Entity.Group;

import java.util.List;

public interface GroupService {
    Group createGroup(Group group);
    List<Group> getAllGroups();
    Group getGroupById(Long id);
    void deleteGroup(Long id);

}
