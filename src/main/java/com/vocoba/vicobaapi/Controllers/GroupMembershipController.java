package com.vocoba.vicobaapi.Controllers;
import com.vocoba.vicobaapi.Entity.GroupMembership;

import com.vocoba.vicobaapi.Repository.GroupMembershipRepository;
import com.vocoba.vicobaapi.Services.GroupMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/group-memberships")
public class GroupMembershipController {

    @Autowired
    private GroupMembershipService groupMembershipService;

    @PostMapping("/create")
    public GroupMembership addMeMemberToGroup(@RequestBody GroupMembership membership) {
        return groupMembershipService.addMemberToGroup(membership);
    }

    @GetMapping("/read")
    public List<GroupMembership> getAllMemberships() {
        return Collections.singletonList((GroupMembership) groupMembershipService.getAllMembership());
    }

    @GetMapping("/read/{id}")
    public GroupMembership getMembershipById(@PathVariable Long id) {
        return (GroupMembership) groupMembershipService.getMembershipById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMembership(@PathVariable Long id) {
        groupMembershipService.removeMembership(id);
    }
}
