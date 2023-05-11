package com.ukraine.dc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    private static final ObjectMapper mapper = new ObjectMapper();

    private static String testJson = """
            {
                "id": 1,
                "name": "Bobik",
                "age": 12,
                "type": "Cat"
            }
            """;

    public static void main(String[] args) throws JsonProcessingException {
        Object animal = mapper.readValue(testJson, Animal.class);
        System.out.println();
    }

    private static String geePotentialDog() throws JsonProcessingException {
        Dog dog = new Dog(1, "Bobik", 12);
        return mapper.writeValueAsString(dog);
    }

}