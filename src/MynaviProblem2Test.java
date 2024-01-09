import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MynaviProblem2Test {

    @Test
    public void test1() {

        String input = "0";
        List<String> except = new ArrayList<String>();
        except.add("0 0 0");

        List<String> result = mainTestExecute(input);
        Assert.assertEquals(except, result);

    }

    @Test
    public void test2() {

        String input = "1";
        List<String> except = new ArrayList<String>();

        except.add("0 0 0");
        except.add("0 0 1");
        except.add("0 1 0");
        except.add("1 0 0");

        List<String> result = mainTestExecute(input);
        Assert.assertEquals(except, result);

    }

    @Test
    public void test3() {

        String input = "2";
        List<String> except = new ArrayList<String>();

        except.add("0 0 0");
        except.add("0 0 1");
        except.add("0 0 2");
        except.add("0 1 0");
        except.add("0 1 1");
        except.add("0 2 0");
        except.add("1 0 0");
        except.add("1 0 1");
        except.add("1 1 0");
        except.add("2 0 0");

        List<String> result = mainTestExecute(input);
        Assert.assertEquals(except, result);

    }

    @Test
    public void test4() {

        String input = "3";
        List<String> except = new ArrayList<String>();

        except.add("0 0 0");
        except.add("0 0 1");
        except.add("0 0 2");
        except.add("0 0 3");

        except.add("0 1 0");
        except.add("0 1 1");
        except.add("0 1 2");

        except.add("0 2 0");
        except.add("0 2 1");

        except.add("0 3 0");

        except.add("1 0 0");
        except.add("1 0 1");
        except.add("1 0 2");

        except.add("1 1 0");
        except.add("1 1 1");

        except.add("1 2 0");

        except.add("2 0 0");
        except.add("2 0 1");
        except.add("2 1 0");

        except.add("3 0 0");

        List<String> result = mainTestExecute(input);
        Assert.assertEquals(except, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentMin() {

        String input = "-1";
        mainTestExecute(input);

    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentMax() {

        String input = "22";
        mainTestExecute(input);

    }

    private List<String> mainTestExecute(String str) {
        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);
        MynaviProblem2 main = new MynaviProblem2();
        return main.generation();
    }
}
