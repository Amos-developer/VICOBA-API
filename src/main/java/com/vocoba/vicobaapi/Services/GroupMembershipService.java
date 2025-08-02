package com.vocoba.vicobaapi.Services;

import com.vocoba.vicobaapi.Repository.GroupMembershipRepository;

import java.util.List;

public interface GroupMembershipService {
    GroupMembershipRepository addMeMemberToGroup(GroupMembershipRepository membership);
    List<GroupMembershipRepository> getAllMembership();
    GroupMembershipRepository getMembershipById(Long id);
    void removeMembership(Long id);

}
