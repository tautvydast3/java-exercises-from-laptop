package Model;

import Helpers.HelperFunctions;

public class Cast {
    //Atributai
    private String actorName;

    //#region Getteriai ir Setteriai


    public String getActorName() {
        return this.actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }


    //#endregion

    // Konstruktorius
    public Cast(String actorName) {
        this.actorName = actorName;
    }

    // Kiti metodai


}
