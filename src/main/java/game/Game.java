package game;

import characters.monsters.MythicalCreature;
import rooms.Room;
import characters.Character;

import java.util.ArrayList;

public class Game {

    ArrayList<Character> players;
    ArrayList<Room> rooms;

    public Game(ArrayList<Character> players, ArrayList<Room> rooms) {
        this.players = players;
        this.rooms = rooms;
    }

    public ArrayList<Character> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Character> players) {
        this.players = players;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public String enterRoom(Room room){
        String monstersInRoom = "";
        for (MythicalCreature monster : room.getMonsters()){
           return room.getDescription() + " The monsters in the room: " + (monster.getName() + monstersInRoom);
        }
        return null;
    }

}
