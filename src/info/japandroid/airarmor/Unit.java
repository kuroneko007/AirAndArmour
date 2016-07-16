package info.japandroid.airarmor;

import java.io.Serializable;

/**
 * Created by sven on 16/07/16.
 */
public abstract class Unit implements Serializable{

    private String name; // the unit name
    private int move; // movement capability
    private int movesLeft; //moves left this turn
    private boolean ocean; // can move over ocean squares
    private boolean land; // can move over land squares
    private int attack; // attack roll
    private int defence; // defence roll
    private int owner; // player id
    private int location; // where am I
    private int prevLocation; // where did I come from
}
