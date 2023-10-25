package Task0;
public class firstTask{
    public static void main(String[] args){

        int age = 26;
        String name = "Agustin";
        String surname = "Gimenez";
        String nickname = "sorotel";
        
        System.out.println( "Hello there" +" "+ name + " " +surname);
        System.out.println( "Are you tring to log in as" +" "+ nickname + "?");

        if(age >= 18){
            System.out.println("Come in sir, what would you like to drink?");
    }else{
        System.out.println("You must be 18 or older to drink.");
    }

}}