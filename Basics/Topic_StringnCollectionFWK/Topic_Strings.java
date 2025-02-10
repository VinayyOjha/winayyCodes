import java.util.Arrays;
// import java.util.regex.Pattern;

public class Topic_Strings {
    public static void main(String[] args) {
        func2("Vivek@Ojha@MCA");
    }
    
    static void func2(String name){

        //  ->  METHOD 1 : length() | isBlank() | isEmpty()
        System.out.println("METHOD 1 : ");
        System.out.println("LENGTH : "+name.length());
        System.out.println("CONTAINS : "+name.contains("CA"));
        System.out.println("EQUALS IGNORE CASE : "+name.equalsIgnoreCase("vivek@ojha@mca"));
        

        //  ->  STRING COMPARISON : equals() | equalsIgnoreCase("")
        // str1.compareTo(str2) | compareToIgnoreCase()
        // 1. positive value : str1 comes after str2 (lexicographically)
        // 2. 0 : strings are equal
        // 3. negative value : str1 comes before str2
        System.out.println("COMPARE TO : "+"John".compareTo("Johnny")); // -ve
        System.out.println("apple".compareTo("ball"));// -ve
        System.out.println("ball".compareToIgnoreCase("apple")); // +ve


        //  ->  METHOD 2 : .charAt(index) | indexOf() | contains("") | lastIndexOf()
        System.out.println("\nMETHOD 2 : ");
        System.out.println("CHAR AT : "+name.charAt(2));
        System.out.println("INDEX OF : "+name.indexOf("@"));
        System.out.println("LAST INDEX OF : "+name.lastIndexOf("@"));
       
        //  ->  METHOD 3 : .replace() 
        System.out.println("\nMETHOD 3 : ");
        System.out.println(name.replace("@","^"));
        
       // METHOD 4 : split() - returns an array of String
       //  IMPORTANT :  split("\\.") 
       // split(Pattern.quote("."))
       System.out.println("\nMETHOD 4 : \n"+Arrays.toString(name.split("@")));
       System.out.println(Arrays.toString("V..ive.k".split("\\.")));

       // METHOD 5 : toCharArray() 
       char[] arr = "AbC".toCharArray();
       System.out.println(Arrays.toString(arr)); // [A, b, c]
        
        //  ->  METHOD 6 : toLowerCase(), toUpperCase(), startsWith(), 
        //endsWith()
    }
}
