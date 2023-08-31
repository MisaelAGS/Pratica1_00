package atividade2;

public class Main {
    public static void main(String[] args) {
        EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
        empregado.setNome("João");
        empregado.setSalario(2000.0);
        empregado.setHorasAula(20);

        System.out.println("Gastos: R$" + empregado.getGastos());
        System.out.println(empregado.getInfo());
    }
}
