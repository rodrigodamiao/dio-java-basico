public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;

        int subtrair = Calculadora.subtrair(n1,n2);
        System.out.println(subtrair);

        int somar = Calculadora.somar(n1,n2);
        System.out.println(somar);

        int multiplicar = Calculadora.multiplicar(n1,n2);
        System.out.println(multiplicar);

        int dividir = Calculadora.dividir(n1,n2);
        System.out.println(dividir);

        final String BR = "BRASIL";
        System.out.println(BR);

        String primeiroNome = "Rodrigo";
        String segundoNome = "Damião";
        String nomeCompleto = Nomes.nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

        Usuarios usuarios = new Usuarios();
        usuarios.dadosUsuario();

        int numero = 5;
        if(numero > 0){
            System.out.println("Positivo: " + numero);
        }else{
            System.out.println("Negativo: " + numero);
        }

        int valor = 5;
        System.out.println(--valor);
        System.out.println(valor--);
        System.out.println(valor);

        int a,b;
        a=5;
        b=5;

        String resultado = a==b?"verdadeiro":"falso";
        System.out.println(resultado);

        String nome1 = "Rodrigo";
        String nome2 = new String("Rodrigo");
        System.out.println(nome1==nome2); // false
        System.out.println(nome1.equals(nome2));// true

        System.out.println(somar2(5,5));

        String[] alunos = Alunos.alunos2;
        Alunos.listaAlunos(alunos);
    }

    public static int somar2(int num1, int num2){
        return num1+num2;
    }
    public static void imprimir2(String texto) {
        System.out.println(texto);
    }
    public static String imprimir3(String texto){
        System.out.println(texto);
        return texto;
    }


}

class Calculadora{
    public static int subtrair(int n1, int n2){
        return n1-n2;
    }
    public static int somar(int n1, int n2){
        return n1+n2;
    }
    public static int multiplicar(int n1, int n2){
        return n1*n2;
    }
    public static int dividir(int n1, int n2){
        return n1/n2;
    }
}

class Nomes{
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

class Usuarios{

    String[] emails = {"usuario1@gmail.com", "usuario2@gmail.com", "usuario3@gmail.com"};
    String[] nomes = {"Rodrigo", "Bruno", "Vinicius"};
    String[] ids = {"1","2","3"};

    public  void dadosUsuario(){
        for(int i = 0; i<ids.length;i++){
            System.out.println("id:"+ids[i]+" / "+nomes[i]+" / "+emails[i]);
        }
    }
}

class Alunos{
    public static String[] alunos = {"Rodrigo", "Bruno", "Felipe", "Gabriela"};
    public static String[] alunos2 = {"Rodrigo2", "Bruno2", "Felipe2", "Gabriela2"};

    public static void listaAlunos(String[] alunos){
        for(String aluno : alunos){
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}

