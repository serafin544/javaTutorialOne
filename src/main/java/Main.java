public class Main {
    public static void main(String[] args) {
        int myVar;
        myVar = 50;
        System.out.println(myVar);

        int anotherVar = 100;
        System.out.println(anotherVar);

        myVar = anotherVar;
        System.out.println(myVar);

        anotherVar = 200;
        System.out.println(anotherVar);

        System.out.println(myVar);

        //Integer type
        //Byte 8  -128 - 127
        //Short 16 -32768 - 32767
        //int 32 -2bill to +2bill
        //long big and add the capital L to it
        //Floating types allows fraction portion have to add f in tha

        //Char stores single unicode character
        // char regularU = 'U'
        // boolean iLikeJava = true;
        int firstValue = 100;
        int otherValue = firstValue; // otherValue = 100
        firstValue = 50; //firstValue changes but otherValue stays the same


        //Add     +
        //Subtract  -
        //Multiply   *
        //divide      /  the answer will be the same type whole/decimal number as the problem
        //modulus      %  13%5 = 3 since 5 goes into 10 2 whole times making the 3 the reminder


        //Prefix/postfix operators
        //++ increments value by 1
        //-- decrements value by 1

        // Prefix
        int myVal0 = 5;
        System.out.println(++myVal0);
        System.out.println(myVal0);

        //Post fix
        int myVal = 5;
        System.out.println(myVal++);
        System.out.println(myVal);

        //Compound Assignment Operators

        int myVal3 = 50;
        myVal3 -= 5;
        System.out.println(myVal3);

        int result = 100;
        int val01 = 5;
        int val02 = 10;
        result /= val01 * val02;
        System.out.println(result);

        //Postfix > PreFix > multiplicative >


        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA -valB /valC;

        int result2 = (valA - valB) /valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));
        System.out.println(result3);
        System.out.println(result4);


        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result001 = byteVal;
        // short result001 = longVal; no work
        //short result001 = (short) longVal; there was a cast
        short result002 = (short)(byteVal - longVal);
        double result003 = longVal - doubleVal;
        long result004 = (long) (shortVal - longVal =floatVal +doubleVal);
        System.out.println("Success");


    }
}
