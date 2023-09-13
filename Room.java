package edu.jhupte.cs605201.part1;

/**
 * Room.java
 *
 * Created: 
 *
 * @author Nickolas A. Hickman
 */

final public class Room {
    /**
     * Default constructor, creates a new <code>Room</code> instance.
     *
     */
    public Room() {
    }
    
    /**
     * Display room.
     *
     * @param args a <code>String[]</code> value
     */
    static public void main(String[] args) {

        /*Adjust horizontal position of each element. Enter the column which you would like each element to start in.*/
        int room_horiz = 6;
        int key_horiz = 4;
        int key_elmt_horiz = 6;

        /*Intialize counter and strings to build strings with spaces of lenth corresponding to the desired distance from the left edge*/
        String rm_spc = "", ky_spc = "", ke_spc = "";
        int i = 1;

        /*Loops to convert int to string composed of spaces.*/
        while(i < room_horiz) {
            rm_spc = rm_spc + " ";
            i++;
        }

        i = 1;
        while(i < key_horiz) {
            ky_spc = ky_spc + " ";
            i++;
        }

        i = 1;
        while(i < key_elmt_horiz) {
            ke_spc = ke_spc + " ";
            i++;
        }

        /*Print room map with appropriate horizontal position.*/
        System.out.println(
                "\n"+
                        rm_spc+"-------www-------\n"+
                        rm_spc+"|               |\n"+
                        rm_spc+"|               |\n"+
                        rm_spc+"s               w\n"+
                        rm_spc+"|               w\n"+
                        rm_spc+"d               w\n"+
                        rm_spc+"d               |\n"+
                        rm_spc+"|               o\n"+
                        rm_spc+"|               |\n"+
                        rm_spc+"-----www-www-----\n\n"+
                        ky_spc+"KEY:\n"+
                        ke_spc+"| vertical wall\n"+
                        ke_spc+"- horizontal wall\n"+
                        ke_spc+"d door\n"+
                        ke_spc+"w window\n"+
                        ke_spc+"o electrical outlet\n"+
                        ke_spc+"s electrical switch");
    }
}// Room
