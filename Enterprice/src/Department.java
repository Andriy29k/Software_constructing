import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private String name;
    private List<Employee> employees;

    public List<Employee> getEmployees(){
        return employees;
    }

    public void addEmployee (Employee employee){
        employees.add(employee);
    }

    public Department(Long id,String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
