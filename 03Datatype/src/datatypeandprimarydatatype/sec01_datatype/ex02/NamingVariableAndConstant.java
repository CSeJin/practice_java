package datatypeandprimarydatatype.sec01_datatype.ex02;

public class NamingVariableAndConstant {
    public static void main(String[] args) {
        // #1. 변수명
        boolean aBcD; //권고사항 위배
        byte 가나다;
        short _abcd;
        char $ab_cd;
        // int 1abc;    //숫자는 변수명 처음으로 올 수 없다.
        long abcd1;
        // float int;   //키워드는 변수명으로 채택할 수 없다.
        double main;    //메서드명과 변수명은 동일해도 된다. 호출방법이 다르기 때문. but 가독성 해침
        // int my Work; //특수키는 _와 $만 가능
        String myClassName;
        int ABC;     //권고사항 위배, 상수규칙


        // #2. 상수명
        final double PI;    // 최초 값을 대입한 뒤 값 변경 불가
        final int MY_DATA;  // 단어마다 _로 가독성 up
        final float myData; // 가독성 위배

        myData = 3;
        // myData = 5;  // 상수값 변경 시 오류 발생
    }
}
