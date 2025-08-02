package com.vocoba.vicobaapi.Services.ServiceImplementations;

import com.vocoba.vicobaapi.Entity.Group;
import com.vocoba.vicobaapi.Repository.GroupRepository;
import com.vocoba.vicobaapi.Services.GroupService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;
    @Override
    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Group getGroupById(Long id) {
        return groupRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Group not Found...")
        );
    }

    @Override
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }
}
