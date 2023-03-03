package ru.TSUtmb;
import ru.TSUtmb.Tasks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests
{
    @Test
    public void Task1Test()
    {
        assertEquals(false,
                Tasks.Task1Check(5,
                Tasks.Task1Equation(5)
                ));
        assertEquals(true,
                Tasks.Task1Check(3,
                        Tasks.Task1Equation(3)
                ));
    }
}
