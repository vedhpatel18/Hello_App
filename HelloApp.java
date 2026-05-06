/* 
@version 4.0
@author Vedh
*/
public class HelloApp{
    public static void main (String[] args){
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < args.length; i++){
            nameBuilder.append(args[i]);
            if (i < args.length - 1){
                nameBuilder.append(", ");
            }
        }
        if (args.length == 0){
        System.out.println("Hello, World!");
        return;
        }
        String name = nameBuilder.toString();
        System.out.println("Hello " + name + "!");
    }
}