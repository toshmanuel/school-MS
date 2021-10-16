package services;

import db.SchoolDb;
import exceptions.SchoolNotFoundException;
import models.School;

import java.util.List;

// TODO: 10/16/21 https://www.github.com/toshmanuel/school-MS.git
// TODO: 10/16/21 https://codeburst.io/solid-design-principle-using-swift-fa67443672b8 
// TODO: 10/16/21 https://www.readme.so

public class SchoolServiceImpl implements SchoolService {
    private final SchoolDb schoolDb;

    public SchoolServiceImpl(SchoolDb schoolDb) {
        this.schoolDb = schoolDb;
        System.out.println(schoolDb);
    }

    @Override
    public void add(School school) {
        schoolDb.add(school);
    }

    @Override
    public void delete(School school) {
        schoolDb.delete(school);
    }

    @Override
    public School update(long id, School school) throws SchoolNotFoundException {
        //TODO: implement the update method by adding a data transfer object (DTO)
        School foundSchool = findById(id);

        return foundSchool;
    }

    @Override
    public School findById(long id) throws SchoolNotFoundException {
        School foundSchool = schoolDb.findById(id);
        if(foundSchool == null) {
            throw new SchoolNotFoundException("School with this id is not present");
        }
        return foundSchool;
    }

    @Override
    public List<School> getAll() {
        return schoolDb.getAll();
    }

    @Override
    public void addAll(School... schools) {
        for (School sch : schools){
            schoolDb.add(sch);
        }
    }

}
