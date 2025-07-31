package com.vocoba.vicobaapi.Services;

import com.vocoba.vicobaapi.Repository.GroupMembership;

import java.util.List;

public interface GroupMembershipService {
    GroupMembership addMeMemberToGroup(GroupMembership membership);
    List<GroupMembership> getAllMembership();
    GroupMembership getMembershipById(Long id);
    void removeMembership(Long id);

}
