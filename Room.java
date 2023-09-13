package edu.jhupte.cs605201.part2;

public class Room{
    /*Inputs string and int. Prints string with int number of spaces from the left edge.*/
    static void printIndent(String tempString, int colStart){
        StringBuffer sb = new StringBuffer(tempString);
        for(int i=1; i<colStart; i++){
            sb = sb.insert(0," ");
        }
        System.out.println(sb);
    }

    static void alignCheck(boolean TEST){
        if (TEST==true){printIndent("123456789012345678901234567890",0);}
    }

    public static void main(String[] args){
        final boolean TEST = false;

        /*Declaring spacing from left edge by component.*/
        final int MAP_SPC = 7;
        final int KEY_HD_SPC = 4;
        final int KEY_SPC = 7;
        final int CALC_HD_SPC = 2;
        final int CALC_SUBHD_SPC = 4;
        final int CALC_SPC = 7;

        /*Declaring constants*/
        final float CEILING_HEIGHT =8.5f;
        final float DOOR_WIDTH = 3.5f;
        final float DOOR_HEIGHT = 6.75f;
        final float WHITE_COST = 24.98f, BLUE_COST = 30.98f;
        final float TAX_RATIO = 1.06f;
        final int WALL_1_LENGTH = 17;
        final int WALL_2_LENGTH = 8;
        final int WINDOW_WIDTH = 3;
        final int WINDOW_HEIGHT = 4;
        final int PRIMER_COATS = 1, COLOR_COATS = 2;
        final int WHITE_COVERAGE = 500, BLUE_COVERAGE = 400;


        /*Declaring variables for calculations*/
        double ceilingArea, wallArea, windowArea, doorArea;
        double northArea, southArea, eastArea, westArea, totalWhiteArea, totalBlueArea;
        double whiteGallons, whiteGallonsPurchase, whiteCost;
        double blueGallons, blueGallonsPurchase, blueCost, totalCost;

        /*Area algorithms*/
        ceilingArea = WALL_1_LENGTH * WALL_2_LENGTH;
        windowArea = WINDOW_HEIGHT * WINDOW_WIDTH;
        doorArea = DOOR_WIDTH * DOOR_HEIGHT;
        northArea = WALL_1_LENGTH * CEILING_HEIGHT - windowArea;
        southArea = WALL_1_LENGTH * CEILING_HEIGHT - (2 * windowArea);
        eastArea = WALL_2_LENGTH * CEILING_HEIGHT - windowArea;
        westArea = WALL_2_LENGTH * CEILING_HEIGHT - doorArea;
        wallArea = northArea + southArea + eastArea + westArea;

        /*Cost algorithms*/
        totalWhiteArea = COLOR_COATS * ceilingArea + PRIMER_COATS * wallArea;
        whiteGallons = totalWhiteArea / WHITE_COVERAGE;
        whiteGallons = Math.round(whiteGallons * 100) / 100.0;
        whiteGallonsPurchase = Math.ceil(whiteGallons);
        whiteCost = whiteGallonsPurchase * WHITE_COST;
        whiteCost = Math.round(whiteCost * 100) / 100.0;

        totalBlueArea = COLOR_COATS * wallArea;
        blueGallons = totalBlueArea / BLUE_COVERAGE;
        blueGallons = Math.round(blueGallons *100) / 100.0;
        blueGallonsPurchase = Math.ceil(blueGallons);
        blueCost = blueGallonsPurchase * BLUE_COST;
        blueCost = Math.round(blueCost * 100) / 100.0;

        totalCost = (whiteCost + blueCost) * TAX_RATIO;
        totalCost = Math.round(totalCost * 100) / 100.0;

        alignCheck(TEST);
        printIndent("",0);
        printIndent("-------www-------",MAP_SPC);
        printIndent("|               |",MAP_SPC);
        printIndent("|               |",MAP_SPC);
        printIndent("s               w",MAP_SPC);
        printIndent("|               w",MAP_SPC);
        printIndent("d               w",MAP_SPC);
        printIndent("d               |",MAP_SPC);
        printIndent("|               o",MAP_SPC);
        printIndent("|               |",MAP_SPC);
        printIndent("-----www-www-----",MAP_SPC);
        printIndent("",0);
        alignCheck(TEST);
        printIndent("KEY:                  ",KEY_HD_SPC);
        printIndent("|   vertical wall     ",KEY_SPC);
        printIndent("-   horizontal wall   ",KEY_SPC);
        printIndent("d   door              ",KEY_SPC);
        printIndent("w   window            ",KEY_SPC);
        printIndent("o   electrical outlet ",KEY_SPC);
        printIndent("s   electrical switch ",KEY_SPC);
        printIndent("===========================",0);
        alignCheck(TEST);
        printIndent("ROOM PAINT",CALC_HD_SPC);
        printIndent("Ceiling white @ $24.98/gallon",CALC_SUBHD_SPC);
        printIndent("Use: " + whiteGallons +" gallons",CALC_SPC);
        printIndent("Purchase: " + String.format("%.0f",whiteGallonsPurchase) +" gallons",CALC_SPC);
        printIndent("Price: $" + whiteCost,CALC_SPC);
        printIndent("",0);
        printIndent("Blue @ $30.98/gallon",CALC_SUBHD_SPC);
        printIndent("Use: " + blueGallons + " gallons",CALC_SPC);
        printIndent("Purchase: " + String.format("%.0f",blueGallonsPurchase)  + " gallons",CALC_SPC);
        printIndent("Price: $" + blueCost,CALC_SPC);
        printIndent("",0);
        printIndent("TOTAL COST: $" + totalCost + "", CALC_SUBHD_SPC);
        printIndent("",0);
    }

}