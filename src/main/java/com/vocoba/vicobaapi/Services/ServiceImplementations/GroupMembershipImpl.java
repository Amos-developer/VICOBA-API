package com.vocoba.vicobaapi.Services.ServiceImplementations;

import com.vocoba.vicobaapi.Repository.GroupMembershipRepository;
import com.vocoba.vicobaapi.Services.GroupMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupMembershipImpl implements GroupMembershipService {

    @Autowired
    private GroupMembershipRepository groupMembershipRepository;

    @Override
    public GroupMembershipRepository addMeMemberToGroup(GroupMembershipRepository membership) {
        return groupMembershipRepository.save(membership);
    }

    @Override
    public List<GroupMembershipRepository> getAllMembership() {
        return groupMembershipRepository.findAll();
    }

    @Override
    public GroupMembershipRepository getMembershipById(Long id) {
        return groupMembershipRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("No membership found...")
        );
    }

    @Override
    public void removeMembership(Long id) {
        groupMembershipRepository.deleteById(id);
    }
}
