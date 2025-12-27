public class StringMain {
    public static void main(String[] args){
        String name = "             Subham           ";

        name = name.trim();
        int ln = name.length();

        char letter = name.charAt(1);
        int index = name.indexOf("a");
        name = name.toLowerCase();
        name = name.toUpperCase();

        int lastIndex = name.lastIndexOf("m");
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        String email = "Username@gmail.com";


        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println(username);
        System.out.println(domain);

    }
}
