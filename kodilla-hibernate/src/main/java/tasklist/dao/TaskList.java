package tasklist.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {

    private int id;
    private String listName;
    private String description;

    public TaskList() {

    }
    public TaskList(int id, String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    public TaskList(String listname, String name1) {
    }

    @Id
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
