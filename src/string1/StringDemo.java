package string1;



public class StringDemo {
    public static void main(String[] args) {

        StringBuffer s1=new StringBuffer();

        System.out.println(s1.capacity());


        String str = "1234567890123456";
        s1.append(str);

        System.out.println(s1.capacity());

        s1.append(str);
        System.out.println(s1.capacity());
        s1.append(str);

        System.out.println(s1.capacity());

    }
}
