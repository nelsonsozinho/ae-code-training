package br.com.shire42.foobar.squareRobot;

import java.util.Objects;

public class Solution {

    //stoped conodition
    private final int timesCleaned = 3;


    private int column = 0;
    private int row = 0;
    private int rowLength = 0;

    private int columnLength = 0;

    // 1 -> right
    // 2 - down
    // 3 - left
    // 4 - up
    private int direction;

    public int solution(String[] input) {
        int placesCleaned = 0;
        direction = 1;
        rowLength = input.length;
        columnLength = input[row].length();

        //if the matrix just have one place to clean
        //TODO it need to change to better approach
        if(isJustOnePosition()) {
            markAsCleaned(input);
            return 1;
        }

        while (!isNeededToStop(input)) {
            if (!isObstacle(input)) {
                if(!isAlreadyCleaner(input))
                    placesCleaned += 1;

                markAsCleaned(input);
                keepClean();
            } else {
                setupNextDirection();
            }

            keepIntoTheBounds(input);
        }

        return placesCleaned;
    }

    private boolean isJustOnePosition() {
        return rowLength == 1 && columnLength == 1;
    }

    private boolean isAlreadyCleaner(String[] input) {
        if(Character.isDigit(input[row].charAt(column)) || input[row].charAt(column) == 'X')
            return true;
        return false;
    }

    private void keepClean() {
        switch (direction) {
            case 1 -> column += 1;
            case 2 -> row += 1;
            case 3 -> column -= 1;
            case 4 -> row -= 1;
        }
    }

    private void markAsCleaned(String[] input) {
        Character place = input[row].charAt(column);

        if(place.equals('.')) {
            StringBuilder tmp = new StringBuilder(input[row]);
            tmp.setCharAt(column, '1');
            input[row] = tmp.toString();
        } else if(Character.isDigit(place)) {
            int amountTime =  Character.getNumericValue(place) + 1;
            StringBuilder tmp = new StringBuilder(input[row]);
            tmp.setCharAt(column, Integer.toString(amountTime).charAt(0));
            input[row] = tmp.toString();
        }
    }

    private void setupNextDirection() {
        switch (direction) {
            case 1 -> {
                column -= 1;
                row += 1;
                direction = 2;
            }
            case 2 -> {
                column -= 1;
                row -= 1;
                direction = 3;
            }
            case 3 -> {
                column += 1;
                row -= 1;
                direction = 4;
            }
            case 4 -> {
                column += 1;
                row += 1;
                direction = 1;
            }
        }
    }

    private void keepIntoTheBounds(String[] input) {
        if(column >= columnLength) {
            setupNextDirection();
        } else if(row >= rowLength) {
            setupNextDirection();
        } else if(column < 0) {
            column = 0;
            row -= 1;
            direction = 4;
        } else if(row < 0) {
            row = 0;
        }
    }

    private boolean isObstacle(String[] input) {
        //out of the edge
        if(column >= columnLength || row >= rowLength) {
            return true;
        }

        //is obstacle
        return input[row].charAt(column) == 'X';
    }

    private boolean isNeededToStop(String[] input) {
        char place = input[row].charAt(column);

        if(Character.isDigit(place)) {
            int amountTime =  Character.getNumericValue(place);
            return amountTime >= this.timesCleaned;
        }

        return false;
    }

}
