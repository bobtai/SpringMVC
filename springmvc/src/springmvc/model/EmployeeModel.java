package springmvc.model;

import java.io.Serializable;

public class EmployeeModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String name;
    private String title;
 
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
 
    @Override
    public String toString() {
        return "EmployeeModel [id=" + id + ", name=" + name
                + ", title=" + title + "]";
    }
}
