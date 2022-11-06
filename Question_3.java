class Number {
    private double num;

    Number(double n) {
        num = n;
    }

    boolean isZero() {
        return num == 0.0;
    }

    boolean isPositive() {
        return num > 0.0;
    }

    boolean isNegative() {
        return num < 0.0;
    }

    boolean isOdd() {
        return num % 2 != 0.0;
    }

    boolean isEven() {
        return num % 2 == 0.0;
    }

    boolean isPrime() {
        int i, lastnum;

        double a;
        boolean flag;
        a = Math.sqrt(num);
        lastnum = (int) a;
        flag = true;
        for (i = 2; i < lastnum; i++) {
            if (num != i) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    boolean isAmstrong() {

        return num == 0.0;
    }

    double getFactorial() {
        double d = 1;
        for (int i = 1; i < num; i++)
            d *= i;
        return d;
    }

    double getSqrt() {
        double d;
        d = (double) num;
        d = Math.sqrt(d);
        return d;
    }

    double getReverse() {
        double d = 0;
        double temp;
        int db = (int) num;
        while (db > 9) {
            temp = db % 10;
            d = d * 10 + temp;
            db = db / 10;
        }
        d = d * 10 + db;
        return d;
    }

    double sumDigits() {
        double d = 0;
        int n = (int) num;
        while (n > 9) {
            d += n % 10;
            n = n / 10;
        }
        d += n;
        return d;
    }

    void dispBinary() {
        System.out.println("ByteValue :" + Long.toBinaryString((long) num));
    }

}

public class Question_3 {
    public static void main(String[] args) {
        Number num1 = new Number(152.84d);
        num1.dispBinary();
        System.out.println("isZero: " + num1.isZero());
        System.out.println("isPositive: " + num1.isPositive());
        System.out.println("isNegative: " + num1.isNegative());
        System.out.println("isOdd: " + num1.isOdd());
        System.out.println("isEven: " + num1.isEven());
        System.out.println("isPrime: " + num1.isPrime());
        System.out.println("isAmstrong: " + num1.isAmstrong());
        System.out.println("getFactorial: " + num1.getFactorial());
        System.out.println("getSqrt: " + num1.getSqrt());
        System.out.println("getReverse:  " + num1.getReverse());
        System.out.println("sumDigits: " + num1.sumDigits());
    }
}
