import org.junit.Assert;
import org.junit.Test;
import com.company.*;
import org.junit.rules.ExpectedException;

/**
 * Created by sasha on 4/21/15.
 */
public class SquareMatrixTest {
    int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

    @Test
    public void testDiagonalMinEl() throws ArrayNotSquareExeption {
        SquareMatrix squareMatrix = new SquareMatrix(arr);
        int min= squareMatrix.diagonalMinElIndex();
        Assert.assertEquals(min,0);
    }
    @Test
    public void testMaxColEl() throws ArrayNotSquareExeption {
        SquareMatrix squareMatrix = new SquareMatrix(arr);
        int max = squareMatrix.maxColElIndex(2);
        Assert.assertEquals(max, 2);

    }
    @Test
    public void testDdiagonalElChange() throws ArrayNotSquareExeption {
        SquareMatrix squareMatrix = new SquareMatrix(arr);

        squareMatrix.diagonalElChange(2);
        Assert.assertArrayEquals(squareMatrix.getArr(), new int[][]{{9, 2, 3}, {4, 5, 6}, {7, 8, 1}});
    }
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void test() throws ArrayNotSquareExeption {
        SquareMatrix squareMatrix =  new SquareMatrix(arr);
        squareMatrix.maxColElIndex(3);
    }
    @Test
    public void minMatrixTest() throws ArrayNotSquareExeption {
        SquareMatrix squareMatrix =  new SquareMatrix(new int[][]{{1}});
        squareMatrix.diagonalMinElIndex();
    }
    @Test(expected = NullPointerException.class)
    public void nullMatrixCreate() throws ArrayNotSquareExeption {
        SquareMatrix squareMatrix =  new SquareMatrix(null);
    }

}
