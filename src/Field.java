public class Field {

    private String SQ1 = " ";
    private String SQ2 = " ";
    private String SQ3 = " ";
    private String SQ4 = " ";
    private String SQ5 = " ";
    private String SQ6 = " ";
    private String SQ7 = " ";
    private String SQ8 = " ";
    private String SQ9 = " ";

    public void setSQ1toP1(){
        SQ1 = "X";
    }
    public void setSQ2toP1(){
        SQ2 = "X";
    }
    public void setSQ3toP1(){
        SQ3 = "X";
    }
    public void setSQ4toP1(){
        SQ4 = "X";
    }
    public void setSQ5toP1(){
        SQ5 = "X";
    }
    public void setSQ6toP1(){
        SQ6 = "X";
    }
    public void setSQ7toP1(){
        SQ7 = "X";
    }
    public void setSQ8toP1(){
        SQ8 = "X";
    }
    public void setSQ9toP1(){
        SQ9 = "X";
    }

    public void setSQ1toP2(){
        SQ1 = "0";
    }
    public void setSQ2toP2(){
        SQ2 = "0";
    }
    public void setSQ3toP2(){
        SQ3 = "0";
    }
    public void setSQ4toP2(){
        SQ4 = "0";
    }
    public void setSQ5toP2(){
        SQ5 = "0";
    }
    public void setSQ6toP2(){
        SQ6 = "0";
    }
    public void setSQ7toP2(){
        SQ7 = "0";
    }
    public void setSQ8toP2(){
        SQ8 = "0";
    }
    public void setSQ9toP2(){
        SQ9 = "0";
    }

    public void printField(){
        System.out.println(SQ1 + " | " + SQ2 + " | " + SQ3);
        System.out.println(SQ4 + " | " + SQ5 + " | " + SQ6);
        System.out.println(SQ7 + " | " + SQ8 + " | " + SQ9);
    }

}
