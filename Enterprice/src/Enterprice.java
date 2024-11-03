import java.util.ArrayList;
import java.util.List;

public class Enterprice {
    private String name;
    private List<Department> departments;

    public List<Department> getDepartments(){
        return departments;
    }

    public void addDepartments(Department department){
        departments.add(department);
    }

    public Enterprice(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
