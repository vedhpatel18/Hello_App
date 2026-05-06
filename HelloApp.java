/* 
@version 5.0
@author Vedh
*/
public class HelloApp{
    public static void main (String[] args){
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String name : args){
            if (! first){
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        if (args.length == 0){
        System.out.println("Hello, World!");
        return;}
        System.out.println("Hello " + nameBuilder + "!");
    }
}