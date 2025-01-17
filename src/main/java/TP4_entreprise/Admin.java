package TP4_entreprise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.lang.Class;


public class Admin {
    private String nom;
    private List<Employee> employees;

    public Admin() {
    }

    public Admin(String nom) {
        this.nom = nom;
        this.employees = new ArrayList<>();
    }


    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }
    public void mettre_a_jour_infos(Employee employee) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Nom: ");
        employee.setName( scanner.nextLine());

        System.out.println("Souhaiter un nouveau admin :");
        boolean test = scanner.nextBoolean();
        scanner.nextLine();
            if (test) {
                System.out.print("Supervisor: ");
                String supervisor = scanner.nextLine();

        //        Admin aClass = (Admin) Class.forName(supervisor).newInstance();

                Class<?> bclass = loadClass(supervisor);
                Constructor constructor[]= bclass.getConstructors();
                employee.setSupervisor((Admin) constructor[0].newInstance());

            }



    }
    public void calcul_percent(){
        int done = 0;
        for (Employee employee : employees) {
            List<Tache> tacheList = employee.getTaches();
//            for (Tache tache : tacheList) {
//                if (tache.getState() == State.Done){
//                    done++;
//                }
//            }

            done += (int) tacheList.stream()
                    .filter(tache -> tache.getState() == State.Done)
                    .count();

            System.out.println(employee.getId()+" "+employee.getName()+"_score : "+done/employee.getTaches().size());
        }
    }
    private Class<?> loadClass(String className) throws ClassNotFoundException {
        Map<String, Class<?>> map = Map.of("Admin", Admin.class);
        return map.get(className);
    }

    public String addTache(Employee employee,Tache t) {

        if (employees.contains(employee)) {
            employee.addTache_emp(t);
            return null;
        }
        return "Employee : "+ employee+" \n doesn't exist !!!" ;

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "nom='" + nom + '\'' +
                ", employees=" + employees +
                '}';
    }
}
