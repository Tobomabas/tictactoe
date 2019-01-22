package gameEngine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<SymbolName>> state;

    int szer;
    int wys;
    private int przekatna;


    public Board(int przekatna) {
        this.przekatna = przekatna;
        state = new ArrayList<List<SymbolName>>();
        for (int i = 0; i < przekatna; i++) {
            List<SymbolName> row = new ArrayList<SymbolName>();
                for (int j = 0; j < przekatna; j++){
                    row.add(SymbolName.PUSTY);
                }
                state.add(row);
        }
    }

    public List<List<SymbolName>> getState() {
        return state;
    }

    public int getSize() {
        return 3;
    }

    public boolean isCellEmpty(int i, int j) {
        return true;


    }
    public SymbolName get (SymbolName symbol, int x, int y){
        return symbol;
    }

    public void insert (SymbolName symbol, int x, int y){

        if (state.get(x).get(y).equals(SymbolName.PUSTY)) {
            state.get(x).set(y, symbol);
        }
        else
            throw new FieldIsUsedException(String.format("Field is already in use"));

    }



}




