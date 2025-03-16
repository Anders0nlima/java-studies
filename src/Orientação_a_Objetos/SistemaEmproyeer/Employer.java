package Orientação_a_Objetos.SistemaEmproyeer;

public class Employer extends Position{
   private String name;
   private int salary;

   public Employer(String position, String name, int salary){
       super(position);
       this.name = name;
       this.salary = salary;
   }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
