package com.melik.JavaExercise.core.json.deserialize.collection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author mselvi
 * @Created 20.01.2024
 */

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ali", "Demir"));
        studentList.add(new Student("Mehmet", "Coşkun"));
        String studentListAsStr = mapper.writeValueAsString(studentList);
        CollectionType collectionType = mapper.getTypeFactory().constructCollectionType(List.class, Student.class);
        List<Student> list = mapper.readValue(studentListAsStr, collectionType);
        list.forEach(student -> student.toString());

    }
}
