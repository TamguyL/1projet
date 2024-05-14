public class Main {
    public static void main(String[] args) {
        // les premitives sont en minuscule
        int x = 10 ; //32bit -2.147.483.648 / 2.147.483.647
        // long y = 10; //64bit -18.446.744.073.709.551.618 / 18.446.744.073.709.551.617
        // short s = 10 ; //16bit −32.768 / 32.767
        // byte b = 10; //8 bits −128 / 127
        char c = 'a'; //Caractère

        // float f = 1.0f ; // float sur 32bit
        // double d = 1.0f; // float sur 64bit

        String nom = "John";
        String nom2 = "John";

        if (nom == nom2) {
            System.out.println("ok");
        }

        // System.out.println(x+y+s+b);
        // System.out.println(f);
        // System.out.println(d);
        System.out.printf("la valeur de x est : %d et le nom est %s \n", x, nom);
        /*
        %c character
        %d decimal (integer) number (base 10) 
        %e exponential floating-point number 
        %f floating-point number
        %i integer (base 10)
        %0 octal number (base 8)
        %s String
        %u unsigned decimal (integer) number 
        %x number in hexadecimal (base 16) 
        %t formats date/time
        %% print a percent sign 
        \% print a percent sign
        */
        System.out.println(c);

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        for  (int j = 0 ; j < 10 ; j++) {
            System.out.println(j);
        }

        String Cars[] = {"volvo", "audi", "citroen"};
        for (String v : Cars) {
            System.out.println(v);
        }
    }
}