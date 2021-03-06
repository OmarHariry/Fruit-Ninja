package ControlTheGame;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import Objects.Bomb;
import Objects.FatalBomb;
import Objects.FruitFactory;
import Objects.IDrops;
public class ClassicMode implements GameMode {
 private int lives=3;
 private int score=0;
 private int combo=0;

    public int getCombo() {
	return combo;
}

public void setCombo(int combo) {
	this.combo = combo;
}

	public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGameVariable() {
        return lives;
    }

    public void setGameVariable(int lives) {
        this.lives = lives;
    }

    @Override
    public void intializeGameVariable() {
        lives=3;
    }

    @Override
    public ArrayList<IDrops> createDrops() {
        ArrayList<IDrops> Drops= new ArrayList<IDrops>();
        FruitFactory factory = new FruitFactory();
        Drops.add(factory.getFruit("apple"));
        Drops.add(factory.getFruit("banana"));
        Drops.add(factory.getFruit("watermelon"));
        Drops.add(factory.getFruit("special"));
        Drops.add(Bomb.getInstance());
        Drops.add(FatalBomb.getInstance());
        return Drops;
    }

    @Override
    public boolean endingCondition(int lives) {
        if(lives==0)
            return true;
         else return false;
    }
}