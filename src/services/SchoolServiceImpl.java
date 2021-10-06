package services;

import db.SchoolDb;
import exceptions.SchoolNotFoundException;
import models.School;

import java.util.List;

public class SchoolServiceImpl implements SchoolService {
    private SchoolDb schoolDb;
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
}
