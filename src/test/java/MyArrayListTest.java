
import org.junit.Assert;
import org.junit.Test;


public class MyArrayListTest {

    private MyArrayList<String> list = new MyArrayList<>();

    @Test
    public void testInit(){
        Assert.assertTrue(list.size() == 0);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testAddAndGetElements(){
        list.add(0,"Kate");
        list.add(1,"Anton");
        list.add(2, "Anna");

        Assert.assertEquals("Kate" , list.get(0));
        Assert.assertEquals("Anna", list.get(2));
    }

    @Test
    public void testRemoveElement(){
        list.add(0,"Kate");
        list.add(1,"Anton");
        list.add(2, "Anna");

        Assert.assertEquals("Anna", list.remove(2));
        Assert.assertTrue(list.size() == 2);
    }
}
