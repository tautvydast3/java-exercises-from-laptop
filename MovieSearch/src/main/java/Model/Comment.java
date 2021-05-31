package Model;

import Helpers.HelperFunctions;

public class Comment {
    //Atributai
    private int id;
    private String cText;

    //#region Getteriai ir Setteriai
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCText() {
        return this.cText;
    }

    public void setCText(String cText) { this.cText = cText; }
//#endregion

    // Konstruktorius
    public Comment(String cText){
        this.id = HelperFunctions.generateNewId();
        this.cText = cText;
    }


}
