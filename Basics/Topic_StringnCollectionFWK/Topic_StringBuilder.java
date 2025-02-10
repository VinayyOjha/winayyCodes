/*
    // NOTE : 1) String class has split(), toCharArray(), isBlank()
    
    2) String : replace("","") StringBuilder : replace(start,end,"")
    if we insert only a single character then start to end portion will be replaced by that single character
*/
public class Topic_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Vivek@MANIT");

        //  ->  1] str.length() / str.equals() / str.isEmpty()
        System.out.println(str+" "+str.length());

        
        //  ->  2] append() 
        // changes original string and returns the updated string
        System.out.println(str.append("@Bhopal"));

        //  ->  3] charAt(index) / deleteCharAt(index)
        System.out.println(str.charAt(5));
        System.out.println(str.deleteCharAt(5));

        //  ->  4] insert(index,"") | delete(start,end) | replace(start,end,"") | reverse()
        // (inclusive,exclusive)
        str.insert(5,"@@@");
        System.out.println(str);
    
        str.replace(str.indexOf("@"),str.indexOf("@")+3,"^^^");
        System.out.println(str);


        str.delete(str.indexOf("^")+1,str.indexOf("^")+3);
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        //  ->  5] str.toString() / str.substring(0, 0)(inclusive,exclusive) : Returns String 
        System.out.println(str.substring(0,4));


        //  ->  6] compareTo
        StringBuilder str2 = new StringBuilder("Alpha");
        System.out.println(str2.compareTo(str)); // -ve
    }
}
