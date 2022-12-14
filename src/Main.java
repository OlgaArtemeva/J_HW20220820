//First level: Допустим, у вас есть прибор, у которого есть 3 колбы. Каждая колба имеет датчик температуры. Считается, что прибор работает правильно, если температура в каждой из трех колб не меньше 100 или есть такая колба, температура которой более 200 градусов. Напишите программу проверки корректности работы такого прибора.
//
//
//        Second level: Допустим, у вас есть прибор, у которого есть 3 колбы. Каждая колба имеет датчик температуры. Считается, что прибор работает правильно, если температура в одной из трех колб (не известно в какой) температура более 150 градусов, а в остальных менее100 градусов, и при этом сумма температур всех трех колб не превышает 250 градусов.

public class Main {
    public static void main(String[] args) {

        double flask1 = 90.0;
        double flask2 = 151.0;
        double flask3 = 100;

        boolean device = ((flask1 >= 100) & (flask2 >= 100) & (flask3 >= 100)) | (flask1 > 200 | flask2 > 200 | flask3 > 200);

        System.out.println("Прибор работает правильно - " + device);
        System.out.println("----------------------------");


//        boolean a=(flask1>150)&(flask2<100)&(flask3<100);
//        boolean b=(flask1<100)&(flask2>150)&(flask3<100);
//        boolean c=(flask1<100)&(flask2<100)&(flask3>150);
//
//        device = (a | b | c) & (flask1+flask2+flask3) < 250;

        device = (((flask1>150)&(flask2<100)&(flask3<100))
                | ((flask1<100)&(flask2>150)&(flask3<100))
                | ((flask1<100)&(flask2<100)&(flask3>150))) & (flask1+flask2+flask3) <= 250;

        System.out.println("Прибор работает правильно - " + device);
    }
}