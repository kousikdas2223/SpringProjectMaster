package pers.example.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pers.example.school.model.Holiday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HolidaysController {

    @GetMapping("/holidays")
    public String displayHolidays(Model model) {
        List<Holiday> holidays = Arrays.asList(
                new Holiday("01/01/2021", "New Year's Day", Holiday.Type.FESTIVAL),
                new Holiday("01/19/2021", "Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
                new Holiday("02/17/2021", "Presidents Day", Holiday.Type.FEDERAL),
                new Holiday("05/25/2021", "Memorial Day", Holiday.Type.FEDERAL),
                new Holiday("07/04/2021", "Independence Day", Holiday.Type.FESTIVAL),
                new Holiday("09/07/2021", "Labor Day", Holiday.Type.FESTIVAL),
                new Holiday("10/12/2021", "Columbus Day", Holiday.Type.FEDERAL),
                new Holiday("11/11/2021", "Veterans Day", Holiday.Type.FEDERAL),
                new Holiday("11/24/2021", "Thanksgiving Day", Holiday.Type.FESTIVAL),
                new Holiday("12/25/2021", "Christmas Day", Holiday.Type.FESTIVAL)
        );

        Holiday.Type[] types = Holiday.Type.values();
        for (Holiday.Type type : types) {
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }
        return "holidays.html";
    }
}
