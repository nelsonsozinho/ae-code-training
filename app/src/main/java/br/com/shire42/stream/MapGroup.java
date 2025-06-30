package br.com.shire42.stream;

import java.util.List;

public class MapGroup {

    private List<Employee> employees;

    public MapGroup() {
        employees = List.of(
                new Employee("1", "Bob", "North"),
                new Employee("2", "Carl", "North"),
                new Employee("3", "Francis", "East"),
                new Employee("4", "Alone", "West")
        );
    }
}

record Employee(
        String codeId,
        String name,
        String area
) {
}
