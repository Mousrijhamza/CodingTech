package TP4_entreprise;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public class test {
    public static void main(String[] args) throws Exception{
        Admin admin = new Admin("Kante");
        Admin admin1 = new Admin("Kante");

        Employee employee = new Employee("Amin");
        Employee employee1 = new Employee("Amin1");
        Employee employee2 = new Employee("Amin2");
        Employee employee3 = new Employee("Amin3");
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        Tache tache = new Tache("T1", LocalDate.now(), LocalDate.of(2025, 1, 1) );
        Tache tache1 = new Tache("T2", LocalDate.now(), LocalDate.of(2025, 1, 1) );
        Tache tache2 = new Tache("T3", LocalDate.now(), LocalDate.of(2025, 1, 1) );
        Tache tache3 = new Tache("T4", LocalDate.now(), LocalDate.of(2025, 1, 1) );
        Tache tache4 = new Tache("T5", LocalDate.now(), LocalDate.of(2025, 1, 1) );

        admin.addTache(employee,tache1);
        admin.addTache(employee, tache2);

        admin.addEmployee(employee);
        admin.addEmployee(employee1);
        System.out.println(admin.getEmployees());
        System.out.println(admin.addTache(employee1, tache3));

        admin.mettre_a_jour_infos(employee1);

    }
}
