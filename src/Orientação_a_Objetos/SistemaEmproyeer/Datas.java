package Orientação_a_Objetos.SistemaEmproyeer;


import java.util.ArrayList;

public class Datas {
  private ArrayList<Employer> itens;

  public Datas(){
      itens = new ArrayList<>();
  }

  public void addDatas(Employer employer){
     itens.add(employer);
  }

    public void displayDatas() {
        System.out.println("=== Folha de Pagamento ===");
        for (Employer employeer : itens) {
            System.out.println("\nNome: " + employeer.getName());
            System.out.println("Cargo:  " + employeer.getPosition());
            System.out.println("Salário: " + employeer.getSalary());
        }
    }
}
