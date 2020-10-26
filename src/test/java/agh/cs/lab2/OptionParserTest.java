package agh.cs.lab2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OptionParserTest {

    @Test
    public void parse() {
        String test= ("f d forward b backward dfeef gfefe l lej left dsa r dfefwwef fefw wef right s");
        OptionParser parser = new OptionParser();
        List<MoveDirection> ltest=parser.parse(test);
        Animal bies = new Animal();
        Animal pies = new Animal();
        String[] testtab=test.split(" ");
        List<MoveDirection> lista  = new ArrayList<MoveDirection>();
        for (int i=0;i<testtab.length;i++){
            if(testtab[i].equals("f") || testtab[i].equals("forward")){
                lista.add(MoveDirection.FORWARD);
            }
            else if(testtab[i].equals("b") || testtab[i].equals("backward")){
                lista.add(MoveDirection.BACKWARD);
            }
            else if (testtab[i].equals("r") || testtab[i].equals("right")){
                lista.add(MoveDirection.RIGHT);
            }
            else if (testtab[i].equals("l") || testtab[i].equals("left")){
                lista.add(MoveDirection.LEFT);
            }
        }
       Assert.assertEquals(lista.size(),ltest.size());
            for (int i = 0; i < ltest.size(); i++) {
                Assert.assertEquals(lista, ltest);
                Assert.assertEquals(lista.get(i),ltest.get(i));
                bies.move(ltest.get(i));
                pies.move(lista.get(i));
                Assert.assertEquals(pies.toString(),bies.toString());
            }
    }
}