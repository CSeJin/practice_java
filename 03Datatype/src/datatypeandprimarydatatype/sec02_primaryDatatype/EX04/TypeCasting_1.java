package datatypeandprimarydatatype.sec02_primaryDatatype.EX04;

public class TypeCasting_1 {
    public static void main(String[] args){
        //#1. 캐스팅 방법
        //#1-1. (타입)값
        int value1 = (int)5.3;       // double
        long value2 = 10;           // int
        float value3 = (float)5.8;     // double
        double value4 = 16;         // int

        System.out.println(value1); // 다운캐스팅으로 값이 버림당함
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);

        //#1-2. L, F, D
        long value5 = 10L;
        long value6 = 10l;  // 숫자 1과 구분이 어려울 수 있으므로 지양
        float value7 = 5.8F;
        float value8 = 5.8f;

        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
    }
}
