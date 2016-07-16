package info.japandroid.airarmor;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sven on 16/07/16.
 */
public class Tile implements Serializable{
    private String name; // location name
    private boolean land; // sea if false
    private ArrayList<Tile> adjacent; //which tiles can be accessed directly
    private ArrayList<Unit> units; //holds all units in this square
    private int owner; //player id
}
