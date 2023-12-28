package experiments;

public class Colors {
    public String green = "\u001B[32m";
    public String yellow = "\u001B[33m";
    public String blue = "\u001B[34m";
    public String black = "\u001B[30m";
    public String white = "\u001B[37m";
    public String red = "\u001B[31m";
    public String purple = "\u001B[35m";
    public String cyan = "\u001B[36m";
    public String reset = "\u001B[0m";

    public void getGreen(String str){
        System.out.println(green + str + reset);
    }

    public void getYellow(String str){
        System.out.println(yellow + str + reset);
    }

    public void getBlue(String str){
        System.out.println(blue + str + reset);
    }

    public void getBlack(String str){
        System.out.println(black + str + reset);
    }

    public void getWhite(String str){
        System.out.println(white + str + reset);
    }

    public void getRed(String str){
        System.out.println(red + str + reset);
    }

    public void getPurple(String str){
        System.out.println(purple + str + reset);
    }

    public void getCyan(String str){
        System.out.println(cyan + str + reset);
    }

    // public String randomColor(String str){
    //     List<Colors>
    // }
}
