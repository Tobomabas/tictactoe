package gameEngine;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void testIsBoardCreatedSuccesfully(){
        //GIVEN
        int przekatna = 3;
        //WHEN
        Board board = new Board(przekatna);
        //THEN
        assertEquals(przekatna, board.getSize());

    }
    @Test
    public void testIsExtendedBoardCreatedSuccesfully(){
        //GIVEN
        int przekatna = 4;
        //WHEN
        Board board = new Board(przekatna);
        //THEN
        assertEquals(przekatna, board.getSize());
    }
    @Test
    public void testifInitialBoardIsEmpty(){
        Board board = new Board(3);

            for(int i = 0; i < 3; i++)
                for(int j = 0; j < 3; i++){
                    assertTrue(board.isCellEmpty(i,j));
                }
    }
    @Test
    public void testInsertSymbolsToCell(){
        Board board = new Board (3);
        SymbolName symbol = SymbolName.KRZYZYK;
        board.insert(symbol, 0,0);
        assertEquals(symbol, board.get(symbol,0,0));

        //assertSame(symbol, board.get(1,1));
        //assertTrue(board.get(1,1).isKolko());
        //assertTrue(board.containsKolko(1,1));
    }
    @Test
    public void testInsertSymbolsToCell2(){
        Board board = new Board (3);
        SymbolName symbol = SymbolName.KRZYZYK;
        board.insert(symbol, 0,0);
        assertEquals(symbol, board.get(symbol,0,0));
    }
    @Test(expected = FieldIsUsedException.class)
    public void testIfSelectUsedField(){
        Board board = new Board (3);
        SymbolName symbol = SymbolName.KRZYZYK;
        board.insert(symbol, 0,0);
        board.insert(symbol, 0,0);
        assertEquals(symbol, board.get(symbol,0,0));
    }

//    @Test
//    public void testIfSelectUsedField2(){
//        try {
//            Board board = new Board(3);
//            Symbol symbol = new Symbol(SymbolName.PUSTY);
//            board.insert(symbol, 0, 0);
//            assertEquals(symbol, board.get(symbol, 0, 0));
//            fail();
//        }catch (FieldIsUsedExceptione e){
//            assertNull(e.getMessage());
//        }
//    }

}