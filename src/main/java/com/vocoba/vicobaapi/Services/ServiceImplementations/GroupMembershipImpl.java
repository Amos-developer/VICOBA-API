package com.vocoba.vicobaapi.Services.ServiceImplementations;

import com.vocoba.vicobaapi.Entity.GroupMembership;
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
    public GroupMembership addMemberToGroup(GroupMembership membership) {
        return groupMembershipRepository.save(membership);
    }

    @Override
    public List<GroupMembership> getAllMembership() {
        return groupMembershipRepository.findAll();
    }

    @Override
    public GroupMembership getMembershipById(Long id) {
        return groupMembershipRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("No membership found...")
        );
    }

    @Override
    public void removeMembership(Long id) {
        groupMembershipRepository.deleteById(id);
    }
}
