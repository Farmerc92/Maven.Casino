package io.zipcoder.casino.player;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SicBoPlayer extends DicePlayer{


    private Player user;
    private ArrayList<Integer> triple = new ArrayList<>();


    public SicBoPlayer(Player user) {
        this.user = user;
    }


    public SicBoPlayer() { }


    public Player getPlayer() {
        return user;
    }


    @Override
    public int rollDice() {
        int sum = 0;
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(6) + 1;
            triple.add(num);
            sum += num;
        }
        return sum;
    }


    public boolean isTriple() {
        System.out.println("The three dice total to " + triple.get(0) +
                " , " + triple.get(1) + " , " + triple.get(2));

        return triple.get(0) == triple.get(1) && triple.get(1) == triple.get(2);
    }

    public void clearTriple() {
        triple.clear();
    }




}
