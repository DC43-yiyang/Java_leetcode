package String;
// Here are some examples for java string processing
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello java";
        char c = s1.charAt(1);
        System.out.println(c);
        char[] c1 = s1.toCharArray();
        c1[0] = 'H';
        String s2 = new String(c1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        }
        else {
            System.out.println("s1 not equals s2");
        }
        String s3 = s1 + "\t+\t" + s2;
        System.out.println(s3);

//        String s4 = s1.append(s2);
//        System.out.println(s4);
//        this method is not available, you should use the stringBuilder to finish it

        StringBuilder s4 = new StringBuilder(s1);
        s4.append(s2);
        System.out.println(s4);


    }
}
