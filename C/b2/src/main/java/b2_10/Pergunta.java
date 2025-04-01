import java.util.ArrayList;


public class Pergunta {

    private final String text;
    private final String id;
    private int counter = 0;

    private final ArrayList<Option> corrects = new ArrayList<>();
    private final ArrayList<Option> wrongs = new ArrayList<>();

    public  Pergunta( String _id, String _text){ id = _id;text = _text;}

    public String getText(){ return  text;}

    public void addOption( String txt, boolean isCorrect){
        Option o = new Option(txt,isCorrect);
        counter++;

        if (isCorrect) corrects.add(o);
        else wrongs.add(o);
    }

    public void displayQuestion(){
        displayQuestion(counter);
    }

    public void displayQuestion(int options){

        if ( options > counter )return;

        ArrayList<Option> toDisplay = new ArrayList<>();

        // assegurar que há pelo menos uma certa

    }

}

class Option {

    private final String text;
    private  final boolean correct;
    protected Option(String txt, boolean c){
        text = txt;
        correct = c;
    }
    protected  String getText(){ return text;}
    protected  boolean isCorrect(){return correct;}
}