package io.zipcoder.casino.Game;

import io.zipcoder.casino.dice.Dice;
import io.zipcoder.casino.player.Player;
import io.zipcoder.casino.utilities.Console;

public class Craps{
    private Dice dice;
    private Player user;
    private Integer passLine;
    private Integer dontPassLine;
    private Integer come;
    private Integer dontCome;
    private Integer field;
    private Integer currentPoint;
    private Boolean isPointOn;
    private Console console;

    public Craps(Player user){
        this.console = new Console(System.in, System.out);
        this.user = user;
        this.dice = new Dice(2);
        this.isPointOn = false;
    }

    public void play(){

    }

    public void setPassLine(Integer bet){
        passLine = bet;
    }

    public Integer getPassLine(){
        return passLine;
    }

    public void setDontPassLine(Integer bet){
        dontPassLine = bet;
    }

    public Integer getDontPassLine(){
        return dontPassLine;
    }

    public void setCome(Integer bet){
        come = bet;
    }

    public Integer getCome(){
        return come;
    }

    public void setDontCome(Integer bet){
        dontCome = bet;
    }

    public Integer getDontCome(){
        return dontCome;
    }

    public void setField(Integer bet){
        field = bet;
    }

    public Integer getField(){
        return field;
    }

    public void setCurrentPoint(Integer newPoint){
        currentPoint = newPoint;
    }

    public Integer getCurrentPoint(){
        return currentPoint;
    }

    public Boolean getIsPointOn(){
        return isPointOn;
    }
}
