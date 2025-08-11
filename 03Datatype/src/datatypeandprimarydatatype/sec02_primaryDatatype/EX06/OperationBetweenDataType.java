package datatypeandprimarydatatype.sec02_primaryDatatype.EX06;

public class OperationBetweenDataType {
    public static void main(String[] args) {
        //#1. 같은 자료형 간 연산
        int value1 = 3+5;   // int
        int value2 = 8/5;   // int -> 1(버림)
        float value3 = 3.0f + 5.0f; // float
        double value4 = 8.0/5.0;    // double -> 1.6

        byte data1 = 3;
        byte data2 = 4;
//        byte value5 = data1 + data2;    // 최소단위는 int임
        int value5 = data1 + data2;


        //#2. 다른 자료형 간 연산
//        int value6 = 5+3.5; // int + double -> double이므로 오류
        double value6 = 5 + 3.5;    //8.5
        int value7 = 5 + (int)3.5;  //8

        double value8 = 8 / 5.0;    //1.6

        byte data3 = 3;
        short data4 = 5;
        int value9 = data3 + data4;         //8
        double value10 = data3 + data4;     //8.0



        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5+"\n");
        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
        System.out.println(value9);
        System.out.println(value10);
    }
}
