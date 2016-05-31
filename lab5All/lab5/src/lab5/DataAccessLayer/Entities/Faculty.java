
package lab5.DataAccessLayer.Entities;

import java.util.LinkedList;
import lab5.DataAccessLayer.EntityFactory.IEntityFactory;

public class Faculty {
    private String name;
    private LinkedList<Group> group;

    public Faculty(String name, LinkedList<Group> group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Group> getGroup() {
        return group;
    }

    public void setGroup(LinkedList<Group> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Faculty{" + "name=" + name + ", group=" + group + '}';
    }
}
