package Longoria.peopledbweb.biz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.cglib.core.Local;



import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Person {


@I
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private BigDecimal salary;
}
