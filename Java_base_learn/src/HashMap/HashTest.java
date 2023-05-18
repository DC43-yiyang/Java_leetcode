package HashMap;

public class HashTest {
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
    }
}
