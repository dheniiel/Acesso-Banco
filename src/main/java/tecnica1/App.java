package tecnica1;

public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(0, "Ciclano", "Rua 3", 40);
        
//        a1.inserir();

        Aluno a2 = new Aluno(0, "Teste", "Rua 10", 20);
        a2.inserir();
        System.out.println(a1);
    }
}
