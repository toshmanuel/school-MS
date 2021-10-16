package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long id;
    private String name;
    private String description;
    private List<Class> classes = new ArrayList<>();
    private SchoolType type;
    private List<Staff> staffs = new ArrayList<>();
    private Address address;
    private List<Student> students = new ArrayList<>();

    private static long count = 0;

    public School(String name, String description, SchoolType type) {
        this.id = ++count;
        this.name = name;
        this.description = description;
        this.type = type;
    }
    public School(){
        this.id = ++count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public SchoolType getType() {
        return type;
    }

    public void setType(SchoolType type) {
        this.type = type;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
