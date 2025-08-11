package datatypeandprimarydatatype.sec02_primaryDatatype.EX03;

public class PrimaryDataType_2 {
    public static void main(String[] args) {
        //#4. 문자

        //#4-1. 문자로 저장하는 방법
        char value1 = 'A';  // 1. 문자로 작성
        char value2 = '가';
        char value3 = '1';  // 중요: 숫자가 아니라 문자다. 유니코드 상으로 49다.
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        //#4-2. 정수로 저장하는 방법
        char value4 = 65;       // 2. 정수로 작성
        char value5 = 0xac00;   // 3. 16진수로 작성
        char value6 = 49;
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6); //문자가 출력된다.

        //#4-3. 유니코드로 저장하는 방법
        char value7 = '\u0041';     // 4. '\ u(16진수)'
        char value8 = '\uac00';
        char value9 = '\u0031';
        System.out.println(value7);
        System.out.println(value8);
        System.out.println(value9);
    }
}
