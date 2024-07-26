package powerpackage;


import org.junit.Test;

public class Powertest {
    @Test
    public void one_raised_to_one_is_one() {
        assert Powerfinder.OF(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_two() {
        assert Powerfinder.OF(2,1) == 2;
    }

    @Test
    public void two_raised_to_two_is_four() {
        assert Powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void three_raised_to_two_is_nine() {
        assert Powerfinder.OF(3, 2) == 9;
    }
}
