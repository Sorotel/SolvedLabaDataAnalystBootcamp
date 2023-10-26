package Task0;
public class firstTask{
    public static void main(String[] args){

        int age = 26;
        String name = "Agustin";
        String surname = "Gimenez";
        String nickname = "sorotel";
        
        System.out.println( "Hello there" +" "+ name + " " +surname);
        System.out.println( "Are you tring to log in as" +" "+ nickname + "?");

        if(args.length > 0){
            String username = args[0];
            System.out.println("Hello there " + username);
    }else{
        System.out.println("A username is required to run this application");
    }


    System.out.println(args[0]);
}}