package ex008_static.constant;

public class MyCalc {
    //объявление константы
    private static final float PI_NUMBER = 3.14F;

    {
        //константу менять НЕЛЬЗЯ
        //PI_NUMBER = 22.1F;
    }

    //при запуске программы запускается класс и первыми выполняются блоки static
}
