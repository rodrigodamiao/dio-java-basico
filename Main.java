public class Main {
    public static void main(String[] args) {
        System.out.println("salve");

        String s = "salve";
        int count = 0;
        int number = 10;
        for(int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

        while(count < number){
            count++;
            System.out.println(count);
        }

        //commit
        System.out.println("commited");
        System.out.println("teste");
    }
}
