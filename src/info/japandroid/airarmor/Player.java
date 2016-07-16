package info.japandroid.airarmor;

import java.io.Serializable;

/**
 * Created by sven on 16/07/16.
 */
public class Player implements Serializable {
    private String name;
    private int id; //will use to identify units & territories owned
    private String country;
    private String allegiance; //axis or allies
    private int ipc; //how much cash
}
