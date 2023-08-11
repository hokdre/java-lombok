package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    String name;
    Integer id;
}
