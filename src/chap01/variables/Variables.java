package chap01.variables;

public class Variables {
    public static void main(StringTest[] args) {

        long myLong = 123578459409484L;
        System.out.println(myLong);
        float myFloat = 3.1415921722012345f;
        System.out.println(myFloat);

        int octNum = 010;       // 8진수 10
        int hexNum = 0x10;      // 16진수 10
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;
        float pi = 3.14f;       //접미사 f 대신 F를 사용해도됨. 생략불가
        double rate = 1.1618d;  //접미사 d 대신 D를 사용해도됨. 생략가능

        System.out.println(octNum);
        System.out.println(hexNum);
        System.out.println(big);
        System.out.println(hex);
        System.out.println(pi);
        System.out.println(rate);

        String a = new String("ABC");
    }
}
