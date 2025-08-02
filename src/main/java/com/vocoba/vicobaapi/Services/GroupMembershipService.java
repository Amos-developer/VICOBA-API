package com.vocoba.vicobaapi.Services;

import com.vocoba.vicobaapi.Entity.GroupMembership;
import com.vocoba.vicobaapi.Repository.GroupMembershipRepository;

import java.util.List;

public interface GroupMembershipService {
    GroupMembership addMemberToGroup(GroupMembership membership);

    List<GroupMembership> getAllMembership();
    GroupMembership getMembershipById(Long id);
    void removeMembership(Long id);

}
