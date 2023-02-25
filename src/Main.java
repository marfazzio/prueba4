public class Main {
    public static void main(String[] args) {

        System.out.println("Holaaaaa!");
        String otraVariable = "x";
        char unaVariable = 'b' ;
        switch (unaVariable) {
            case 'a':
                System.out.println("aaaaa!");
                break;
            case 'x':
                System.out.println("xxxxxx!");
                break;
            case 'z':
                System.out.println("zzzzzz!");
                break;
            default:
                System.out.println("default!");
        }

        int kilowatts = 10000;
        if (kilowatts < 3330 ) {
            System.out.println("Categoria A!");
        } else {
            System.out.println("sigo buscando que categoria es");
        }

        for (int unNum = 0; unNum <=10; unNum++) {
            System.out.println(unNum);
        }



        //boolean estaCondicion = true;
        int otroNum = 5;
        while (otroNum > 0) {
            otroNum = otroNum -1;
            System.out.println("Ejecutando el while");
        }

        System.out.println("Fin!");
    }
}