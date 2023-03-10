import java.util.Scanner;
/** 
 * ACS-1904 Enum supplementary example
 * Sveinson 
*/
enum Colour{
    RED("warm"), GREEN("envious"), BLUE("sad");
    
    private String feeling;
    
    private Colour(String f){
        feeling = f;
    }// end constructor
    
    public String getFeeling(){
        return feeling;
    }

    
}// end enum Colour


public class Chapter4ExtraCode{
    public enum Season{Winter, Spring, Summer, Fall};
    
    public static void main(String[] args) {              
        Scanner scanner = new Scanner(System.in);
        Colour c = null;
        
        Season season = Season.Winter;
        System.out.println(season);
        
        // some errors
        //c = Colour.PURPLE;
        //c = "Purple";
        //c = Colour.BLEU;
        
        // get an array of Colour values
        Colour[] colours = Colour.values();
        System.out.println(colours.length);
        System.out.println(colours[0]);
        
        // travers the enum using .values()
        for(Colour cl : Colour.values())
            System.out.println(cl);
        
        System.out.println(c);
        c = Colour.RED;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling());
        c = Colour.GREEN;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling());
        c = Colour.BLUE;
        System.out.println("the colour " + c + " makes me feel " + c.getFeeling()); 
        
        /* *** using the more complex Element enum *** */
        // Element e = Element.HE;         // helium
        // System.out.println(e);
        
        // Element[] elements = Element.values();
        // System.out.println(elements.length);
        // System.out.println(elements[2].getSymbol());
        
        // for(Element el : Element.values())
            // System.out.println(el);
        
        System.out.println("end of program");
    }
}
