package datatypeandprimarydatatype.sec02_primaryDatatype.EX01;

public class FloatVsDouble {
    public static void main(String[] args){
        //#1. Float과 Double의 정밀도
        float f1 = 0.0000001f;
        System.out.printf("%.10f%n", f1);
        float f2 = 0.00000001f;
        System.out.printf("%.10f%n", f2);

        double d1 = 0.000000000000001;
        System.out.println(d1);
        double d2 = 0.0000000000000001;
        System.out.println(d2);

        double d3 = 1;
        System.out.println(d3);
    }
}
