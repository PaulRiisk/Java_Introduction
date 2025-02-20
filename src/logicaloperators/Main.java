package logicaloperators;

public class Main {
    public static void main(String[] args){

        boolean goodTut = true;
        boolean goodCode = false;
        boolean dontRun = false;

        //Logical Operators
        // && (AND)
        // || (OR)
        // !  (NOT / NEGATION)

        boolean superCode = goodTut && goodCode; //FALSE, both have to be True
        boolean b1 = goodTut || goodCode; //TRUE, because one is True
        boolean badCode = !superCode; //TRUE, because negate superFan

        boolean worstCode = badCode && dontRun;
        worstCode = !(goodTut && goodCode) && dontRun;
    }
}
