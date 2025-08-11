package datatypeandprimarydatatype.sec01_datatype.ex03;

public class RangeOfVariable{
    public static void main(String[] args) {

        int a = 3;

        {
            int b = 5;
            System.out.println(a);  //3
            System.out.println(b);     //5
        }

        System.out.println(a);  //3
        //System.out.println(b);    // 변수 b는 해당 중괄호 안에서 선언되지 않음.
    }
}
