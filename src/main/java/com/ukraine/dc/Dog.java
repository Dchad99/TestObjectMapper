package com.ukraine.dc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog extends Animal {
    private int id;
    private String name;
    private int age;
}
