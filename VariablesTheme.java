
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
    }
}


