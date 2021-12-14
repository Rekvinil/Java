package main.service;

import main.Storage;
import main.entity.Group;

import java.util.Iterator;
import java.util.List;

public class GroupService {
    public void addGroup(Group group){
        Storage.getInstance().addGroups(group);
    }

    public void changeGroup(Group group){
        Group group1 = findGroup(group.getId());
        if(group1 != null){
            group1.setName(group.getName());
            group1.setStudents(group.getStudents());
        }
    }


    public void deleteGroup(int id){
        List<Group> groups = Storage.getInstance().getGroups();
        Iterator<Group> iterator = groups.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getId() == id){
                iterator.remove();
            }
        }
    }


    public Group findGroup(int id){
        List<Group> groups = Storage.getInstance().getGroups();
        for(Group group : groups){
            if(group.getId() == id){
                return group;
            }
        }
        return null;
    }
}
