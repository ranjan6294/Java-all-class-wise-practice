public class Methods_check {
    public static void main(String[] args) {
        String sName ="Ranjan", s2Name=" Plabanika";
       int lanth = sName.length();
       String lowerCase =sName.toLowerCase();
       String uperCase =sName.toUpperCase();
       String trim = s2Name.trim();
    //    print the string lanth
       System.out.println(lanth);
    //    Print the orginal string to lowercase string
    System.out.println(lowerCase);
    //    Print the orginal string to uppercase string
    System.out.println(uperCase);
    //    Print the orginal string to remove sapace in first of string 
       System.out.println(trim);
    //    print index no to last of the string
    System.out.println(sName.substring(3));
    //    print start index no to last indexno -1
       System.out.println(s2Name.substring(0, 5));
       System.out.println(sName.substring(0, 5));
    //    replace any character in using it
       String repl = sName.replace("R", "p");
       System.out.println(repl);
    //    print true or false wher string star with input char
    System.out.println(s2Name.startsWith(" Pla"));
    //    print true or false wher string end with input char
       System.out.println(sName.endsWith("an"));
    //    Return the character in the given index position
       System.out.println(sName.charAt(3));
    //    print the index no first occurence of the given char
       System.out.println(sName.indexOf("ja"));
       System.out.println(sName.indexOf("j", 4));
    //    return the last index of given string
       System.out.println(sName.lastIndexOf("n"));








    }
}
