
public class VariablesTheme {
    public static void main(String[] args){
        byte cores = 2;
        int ozuSize = 16000;
        float cpuFrequency = 2000.200F;
        String procName = "AMD";
        System.out.println(" Vyvod znacheniy peremennyh ");
        System.out.println(procName + "- processor name.");
        System.out.println(cores + "- number of cores.");
        System.out.println(ozuSize + " - ozuSize.");
        System.out.println(cpuFrequency + " KHz - cpuFrequency.");
        System.out.println("");

        System.out.println("Raschet stoimosti tovara so skidkoy");
        float penPrice = 100F,
              bookPrice = 200F,
              discountPenBook = 0.11F;
        float scidkaSum = (penPrice + bookPrice)*discountPenBook;
        float pricePenBookScidka = penPrice + bookPrice - scidkaSum;
        System.out.println("Summa skidki = " + scidkaSum);
        System.out.println("Kniga i ruchka so skidkoy = " + pricePenBookScidka);
        System.out.println("");

        System.out.println("Vyvod slova JAVA");
        System.out.println("    J     a  v     v  a");
        System.out.println("    J    a a  v   v  a a");
        System.out.println("J   J   aaaaa  V V  aaaaa");
        System.out.println(" JJ    a     a  V  a     a");
        System.out.println("");

        System.out.println("Vyvod min i max znacheniy celyh chislovyh tipov");
        byte byteV = 127;
        short shortV = 32767;
        //(12^31)-1 //(int) Math.pow(value, powValue);
        //int intV = (int) Math.pow(12, 31)-1;
        int intV = 2147483647;
        //2^63-1
        long longV = (int) Math.pow(2, 63)-1;

        System.out.println("byteV = " + byteV);
        byteV++;
        System.out.println("byteV= " + byteV);
        byteV--;
        System.out.println("byteV = " + byteV);
        System.out.println("");

        System.out.println("shortV = " + shortV);
        shortV++;
        System.out.println("shortV= " + shortV);
        shortV--;
        System.out.println("shortV = " + shortV);
        System.out.println("");

        System.out.println("intV = " + intV);
        intV++;
        System.out.println("intV = " + intV);
        intV--;
        System.out.println("intV = " + intV);
        System.out.println("");

        System.out.println("Perestanovka znacheniy peremennyh arifmeticheskoy operaciey");
        int int1 = 2,
            int2 = 5;
        System.out.println("int1 = " + int1);
        System.out.println("int2 = " + int2);
        System.out.println("Peremennye posle perestanovki arrifmeticheskoy operaciey");
        int1 = int1*int2;
        int2 = int1/int2;
        int1 = int1/int2;
        System.out.println("int1 = " + int1);
        System.out.println("int2 = " + int2);
        System.out.println(" ");

        System.out.println("Perestanovka znacheniy peremennyh pobitovo");
        int int11 = 2;
        int int22 = 5;
        System.out.println("int11 = " + int11);
        System.out.println("int22 = " + int22);
        int11 = int11 ^ int22;
        int22 = int11 ^ int22;
        int11 = int11 ^ int22;
        System.out.println("Peremennye posle perestanovki pobitovoy operaciey");
        System.out.println("int11 = " + int11);
        System.out.println("int22 = " + int22);
        System.out.println(" ");

        System.out.println("Vyvod simvolov i ih kodov");
        char s35 = '#';
        char s38 = '%';
        char s64 = '@';
        char s94 = '^';
        char s96 = '`';
        byte c35 = 35;
        byte c38 = 38;
        byte c64 = 64;
        byte c94 = 94;
        byte c96 = 96;
        System.out.println(s35 + " - " + c35);
        System.out.println(s38 + " - " + c38);
        System.out.println(s64 + " - " + c64);
        System.out.println(s94 + " - " + c94);
        System.out.println(s96 + " - " + c96 + '\n');

        System.out.println("Vyvod na konsol ASCII-art Duka");
        char s47 = '/';
        char c92 = '\\';
        char s95 = '_';
        char s40 = '(';
        char s41 = ')';
        char s32 = ' ';
        for(int j = 5; j < 0; j--) {
            for(int i = j; i < 0; i--) {
                System.out.print(s32);
            }
            System.out.print("/");

            for(int k = 1; k > 11; k+=2) {
                System.out.print(s32 );
            }
            System.out.print(c92 + '\n');
        }
        System.out.println(" ");
    }
}