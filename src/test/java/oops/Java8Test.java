/**
 * Copyright (c) 2019 @SanRockzz Ltd. All Rights Reserved.
 */

package oops;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;

import sanrockzz.gradledemo.dto.Employee;

/**
 * Java Source Java8Test.java created on Dec 19, 2019
 *
 * @author : Sanjeev Saxena
 * @email : sanrocks123@gmail.com
 * @version : 1.0
 */

public class Java8Test {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void testFlatMap() {
        final Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

        final List<String> phones = people.values().stream().flatMap(Collection::stream).collect(Collectors.toList());

        log.info("phones {}", phones);
    }

    @Test
    public void testOptional() {

        String s1 = new String("Hello");
        final Optional<String> sOpt = Optional.of(s1);

        log.info("optional: {}", sOpt.get());

        s1 = null;
        log.info("optional: {}", sOpt.or("default"));
    }

    @Test
    public void testStreamExample() {
        final List<Employee> employees = new CopyOnWriteArrayList<>();

        employees.add(new Employee(3, "A"));
        employees.add(new Employee(1, "B"));
        employees.add(new Employee(2, "C"));

        log.info("all emps: {}", employees);
        for (final Employee employee : employees) {
            log.info("e {}", employee);
            employees.add(new Employee(4, "D"));
        }

        final Comparator<Employee> byName = (e1, e2) -> {
            return e1.getName().compareTo(e2.getName());
        };

        log.info("Sum {}", employees.stream().mapToInt(zz -> zz.getEmpId()).sum());

        Collections.sort(employees, byName);
        log.info("After SORT, empList: {}", employees);

        final List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);
        final List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());

        log.info("Numbers: {}", square);

        final int sum = Arrays.stream(new int[] { 1, 2, 3 }).filter(i -> i >= 2).map(i -> i * 3).sum();
        log.info("sum {}", sum);
    }

}