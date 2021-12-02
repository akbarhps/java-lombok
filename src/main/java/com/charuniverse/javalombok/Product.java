package com.charuniverse.javalombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString(exclude = "price")
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {

    private final String id;

    private String name;

    private Long price;

}
