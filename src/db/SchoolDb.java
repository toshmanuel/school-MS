package db;

import models.School;
import models.Student;

import java.util.ArrayList;
import java.util.List;

public class SchoolDb {
    private final List<School> schools = new ArrayList<>();

    public void add(School school) {
        schools.add(school);
    }


    public void delete(School school) {
        schools.remove(school);
    }

    public School findById(long id) {
        return schools.get( (int) id);
    }

    public List<School> getAll() {
        return schools;
    }
}
