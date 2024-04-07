package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final EmployeeService employeeService;

    public HelloController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/counter")
    public String count() {
        employeeService.countdown();
        return " количество запросов - " + employeeService.getCount();
    }
}
