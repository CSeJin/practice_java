package datatypeandprimarydatatype.sec02_primaryDatatype.EX05;

public class TypeCasting_2 {
    public static void main(String[] args) {
        // #1. 자동타입변환: upcasting
        float value1 = 3;   // int -> float
        long value2 = 5;    // int -> long
        double value3 = 7;  // int -> double
        byte value4 = 9;    // int -> byte(자동 다운캐스팅 - 저장 가능한 범위만)
        short value5 = 11;  // int -> short(자동 다운캐스팅 - 저장 가능한 범위만)

        // #2. 수동타입변환: downcasting
//        byte value6 = 128;    // 범위를 넘어가는 값
        byte value6 = (byte)128;
//        int value7 = 8.2;     // typeError
        int value7 = (int)8.2;
//        float value8 = 7.2;     // literal type이 아님
        float value8 = 7.2F;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
    }
}
