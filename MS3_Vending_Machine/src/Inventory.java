package MS3_Vending_Machine.src;

class Inventory{

    /*
     *Create a 2D array that can be reinitialized using the
     *first lines of the .json file. This file will need a getter and a 
     *setter with the ability to read in a json file. 
     */
    private Object arr[][];

    //This constructor creates a new 2d array to hold the v
    public Inventory(int rows, int cols){
        arr = new Object[rows][cols];
    }

    //Returns the object at the desired index in the array
    public Object peek(int row, int col){
        Object e = arr[row][col];
        return e;
    }

    //This method sets a single item in the array to null.
    //Equivalent to having an empty slot in a vending machine.
    public Object remove(int row, int col){
        Object e = arr[row][col];
        arr[row][col] = null;
        return e;
    }

    //Takes a snack object and adds it to the array
    public void add(Snack sn, int row, int col){
        arr[row][col] = sn;
    }

}