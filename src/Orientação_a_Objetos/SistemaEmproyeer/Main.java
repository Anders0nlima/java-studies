package Orientação_a_Objetos.SistemaEmproyeer;

public class Main {
    public static void main(String[] args) {
      Datas datas = new Datas();
      Employer employer1 = new Employer("Junior", "Anderson", 5000);
      Employer employer2 = new Employer("Pleno", "Eduardo", 10000);

      datas.addDatas(employer1);
      datas.addDatas(employer2);

      datas.displayDatas();
    }
}
