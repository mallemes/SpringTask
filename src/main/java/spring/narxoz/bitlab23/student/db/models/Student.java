package spring.narxoz.bitlab23.student.db.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    Long id;
    String name;
    String surname;
    Integer exam;
    String mark;
}


