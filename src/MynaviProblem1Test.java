import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

public class MynaviProblem1Test {

    @Test
    public void test1() {
        String result = mainTestExecute("2023");
        Assert.assertEquals("2024", result);
    }

    @Test
    public void test2() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 96; i++) {
            stringBuilder.append("A");
        }

        stringBuilder.append("202");
        String input = stringBuilder.toString() + "3";
        String except = stringBuilder.toString() + "4";

        String result = mainTestExecute(input);
        Assert.assertEquals(except, result);
    }

    @Test
    public void test3() {
        String input = "20232023";
        String except = "20232024";

        String result = mainTestExecute(input);
        Assert.assertEquals(except, result);
    }

    @Test
    public void test4() {
        String input = "-^\\@?!$%&'\"&2023";
        String except = "-^\\@?!$%&'\"&2024";

        String result = mainTestExecute(input);
        Assert.assertEquals(except, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void legnthTest() {
        mainTestExecute("023");
    }

    @Test(expected = IllegalArgumentException.class)
    public void formatTest() {
        mainTestExecute("test2022");
    }

    private String mainTestExecute(String str) {
        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);
        MynaviProblem1 main = new MynaviProblem1();
        return main.convert();
    }
}
