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
