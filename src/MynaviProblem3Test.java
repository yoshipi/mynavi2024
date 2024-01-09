import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MynaviProblem3Test {

    private ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
    private ByteArrayOutputStream errOut = new ByteArrayOutputStream();

    @Before
    public void before() {
        System.setOut(new PrintStream(stdOut));
        System.setErr(new PrintStream(errOut));
    }

    @After
    public void after() {
        System.setIn(null);
        System.setOut(null);
    }

    @Test
    public void executeTest() throws IOException {
        StringBuilder inputStringBuilder = new StringBuilder();
        inputStringBuilder.append("5 9");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("2 3");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("1 U");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("2 3");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("1 R");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("1 D");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("2 3");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("1 L");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("2 1");
        inputStringBuilder.append(System.lineSeparator());
        inputStringBuilder.append("2 5");

        String str = inputStringBuilder.toString();

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        MynaviProblem3 main = new MynaviProblem3();
        main.execute();

        StringBuilder exceptStringBuilder = new StringBuilder();
        exceptStringBuilder.append("3 0");
        exceptStringBuilder.append(System.lineSeparator());
        exceptStringBuilder.append("2 0");
        exceptStringBuilder.append(System.lineSeparator());
        exceptStringBuilder.append("1 1");
        exceptStringBuilder.append(System.lineSeparator());
        exceptStringBuilder.append("1 0");
        exceptStringBuilder.append(System.lineSeparator());
        exceptStringBuilder.append("1 0");
        exceptStringBuilder.append(System.lineSeparator());
        String except = exceptStringBuilder.toString();

        Assert.assertEquals(except, stdOut.toString());

    }

}
