//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0].toUpperCase();
            int times = Integer.parseInt(args[1]);
            String checkLetters = "AEFHILMNORSX";
            char ch;
            String prefix = "";
            for(int i = 0; i < name.length(); i ++){
                ch = name.charAt(i);
                if (checkLetters.indexOf(ch) == -1){
                        prefix = "a ";
                }
                else{
                        prefix = "an";
                }
                System.out.println("Give me " + prefix + " " + ch + ": " + ch + "!");
            }
            System.out.println("What does that spell?");
            for (int i =0; i < times; i ++){
                System.out.println( name + "!!!");
            }
        }
}
