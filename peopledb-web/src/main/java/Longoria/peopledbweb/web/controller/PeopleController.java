package Longoria.peopledbweb.web.controller;

import Longoria.peopledbweb.biz.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping
    public String getPeople(Model model){

        List<Person> people = List.of(
                new Person(1l, "Jake", "Snake", LocalDate.of(1950, 1, 1), new BigDecimal("5000")),
                new Person(2l, "Jake", "Snake", LocalDate.of(1950, 1, 1), new BigDecimal("5000")),
                new Person(3l, "Jake", "Snake", LocalDate.of(1950, 1, 1), new BigDecimal("5000")),
                new Person(4l, "Jake", "Snake", LocalDate.of(1950, 1, 1), new BigDecimal("5000"))

        );
        model.addAttribute("people",people);
        return "people";

    }


}
