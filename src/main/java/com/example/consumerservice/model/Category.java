package com.example.consumerservice.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
public class Category {

    private long id;

    private String name;
}