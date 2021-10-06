package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long id;
    private String name;
    private Math math;
    private String description;
    private List<Class> classes = new ArrayList<>();
    private SchoolType type;
    private List<Staff> staffs = new ArrayList<>();
    private Address address;
    private List<Student> students = new ArrayList<>();
}
