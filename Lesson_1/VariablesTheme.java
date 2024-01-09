public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        String os = "Windows 11";
        String osManufacture = "Windows Corporation";
        int ram = 8;
        String ramManufacturer = "Samsung";
        String cpu = "Intel";
        int freqCpu = 2500;
        int numberOfCpu = 4;
        int hddVolume = 3;
        System.out.println("Характеристика компьютера:\n" +
                "Операционная система: " + os + "\n" +
                "Производитель операционной системы: " + osManufacture + "\n" +
                "Оперативная память: " + ram + "\n" +
                "Производитель оперативной памяти: " + ramManufacturer + "\n" +
                "Процессор: " + cpu + "\n" +
                "Частота процессора: " + freqCpu + "\n" +
                "Количество ядер в процессоре: " + numberOfCpu + "\n" +
                "Ёмкость жёсткого диска: " + hddVolume + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        int sum = penPrice + bookPrice;
        int sumDiscount = (int) (sum * discount);
        int totalPrice = sum - sumDiscount;
        System.out.println("Общая стоимость товаров без скидки: " + sum + " руб.\n" +
                "Сумма скидки: " + sumDiscount + " руб.\n" +
                "Общая стоимость товаров со скидкой: " + totalPrice + " руб.\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        System.out.println("первоначальное значение = " + maxByte);
        maxByte++;
        System.out.println("значение после инкремента на единицу = " + maxByte);
        --maxByte;
        System.out.println("значение после декремента на единицу = " + maxByte);
        short maxShort = 32_767;
        System.out.println("первоначальное значение = " + maxShort);
        ++maxShort;
        System.out.println("значение после инкремента на единицу = " + maxShort);
        maxShort--;
        System.out.println("значение после декремента на единицу = " + maxShort);
        int maxInt = 2_147_483_647;
        System.out.println("первоначальное значение = " + maxInt);
        maxInt++;
        System.out.println("значение после инкремента на единицу = " + maxInt);
        maxInt--;
        System.out.println("значение после декремента на единицу = " + maxInt);
        long maxLong = 9_223_372_036_854_775_807l;
        System.out.println("первоначальное значение = " + maxLong);
        ++maxLong;
        System.out.println("значение после инкремента на единицу = " + maxLong);
        --maxLong;
        System.out.println("значение после декремента на единицу = " + maxLong + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("с помощью третьй переменной: " + "\n" +
                "исходные значения переменных a = " + a + ", b = " +  b);
        a = b;
        b = c;
        System.out.println("новые значения переменных a = " + a + ", b = " +  b);
        System.out.println("с помощью арифметических операций: " + "\n" +
                "исходные значения переменных a = " + a + ", b = " +  b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("новые значения переменных a = " + a + ", b = " +  b);
        System.out.println("с помощью побитовой операции: " + "\n" +
                "исходные значения переменных a = " + a + ", b = " +  b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("новые значения переменных a = " + a + ", b = " +  b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        int ascii36 = (int) dollar;
        System.out.println("код символа - " + ascii36 + "\n" +
                "соответствующий коду символ - " + dollar);
        char asterisk = '*';
        int ascii42 = (int) asterisk;
        System.out.println("код символа - " + ascii42 + "\n" +
                "соответствующий коду символ - " + asterisk);
        char atSign = '@';
        int ascii64 = (int) atSign;
        System.out.println("код символа - " + ascii64 + "\n" +
                "соответствующий коду символ - " + atSign);
        char verticalBar = '|';
        int ascii124 = (int) verticalBar;
        System.out.println("код символа - " + ascii124 + "\n" +
                "соответствующий коду символ - " + verticalBar);
        char tilde = '~';
        int ascii126 = (int) tilde;
        System.out.println("код символа - " + ascii126 + "\n" +
                "соответствующий коду символ - " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + "" + backSlash + "\n   " +
                slash + "  " + backSlash + "\n  " +
                slash + "" + underscore + "" + leftParenthesis + " " + rightParenthesis + "" +
                backSlash + "\n " + slash + "      " + backSlash + "\n" +
                slash + "" + underscore + underscore + underscore + underscore + slash + "" +
                backSlash + underscore + underscore + backSlash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int digit = num % 10;
        int sum1 = hundreds + tens + digit;
        int multiplication = hundreds * tens * digit;
        System.out.println("Число " + num + " содержит:" + "\n" +
                "сотен - " + hundreds + "\n" +
                "десятков - " + tens + "\n" +
                "единиц - " + digit + "\n" +
                "Сумма его цифр = " + sum1 + "\n" +
                "Произведение = " + multiplication + "\n");

        System.out.println("9. Вывод времени");
        int time = 86399;
        int minutes = time % 60;
        int hours = time % minutes;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}