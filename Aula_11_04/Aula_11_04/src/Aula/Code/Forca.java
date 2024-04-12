package Aula.Code;

public class Forca {
    private final String word;
    private StringBuffer uncompleteWord;
    private final int maxErrors;
    private int errors;

    public Forca() {
        Dicionario dicionario = new Dicionario();
        this.word = dicionario.getPalavra();
        uncompleteWord = initializeUncompleteWord(word);
        this.maxErrors = 6;
        this.errors = 0;
    }


    public void guess(char letter){

        int lettersCorrect = 0;

        for (int i = 0; i < word.length(); i++) {

            if(letter == word.toLowerCase().charAt(i)){
                uncompleteWord.setCharAt(i, letter);
                lettersCorrect++;
            }

        }

        if(lettersCorrect == 0){
            errors++;
        }

    }

    public StringBuffer initializeUncompleteWord(String word){

        StringBuffer uncompleteWord = new StringBuffer();

        for (int i = 0; i < word.length(); i++) {
            uncompleteWord.append('_');
        }

        return uncompleteWord;
    }

    public String getPalavraAberta(){
        return word;
    }

    public StringBuffer getPalavraFechada(){
        return uncompleteWord;
    }

    public boolean acertou(){
        String comparisionString = uncompleteWord.toString();

        return comparisionString.equalsIgnoreCase(word);
    }
    public boolean enforcou(){
        return errors == maxErrors;
    }


}
