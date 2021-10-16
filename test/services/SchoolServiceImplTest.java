package services;

import models.School;
import models.SchoolType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolServiceImplTest {

    private SchoolService service;

    @BeforeEach
    void setUp() {
        service = new SchoolServiceImpl();
    }

    @Test
    @DisplayName("Add School")
    void add() {
        School school1 = new School(
                "Gidi Grams",
                "This is a music school",
                SchoolType.OTHERS
        );
        assertEquals(1, school1.getId());
        School school2 = new School(
                "Toska Academy",
                "This is the best school so far in Nigeria",
                SchoolType.ELEMENTARY
        );
        assertEquals(2, school2.getId());
        School school3 = new School(
                "Logic University of Sleeping_John",
                "Logic and Sleep while buying time",
                SchoolType.ELEMENTARY
        );
        assertEquals(3, school3.getId());
        service.add(school1);
        service.add(school2);
        service.add(school3);




    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
    }

    @Test
    void getAll() {
    }
}