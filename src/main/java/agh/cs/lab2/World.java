package agh.cs.lab2;

import java.util.List;

public class World {
    public static void main(String[] args) {
        Animal dog = new Animal();
        OptionParser a = new OptionParser();
        List<MoveDirection> x=a.parse("f d forward b backward def gefeff l lej left dsa r dfefwwef fefw wef right s");
        System.out.println(dog.toString());
        for(int i=0;i<x.size();i++){
            dog.move(x.get(i));
            System.out.println(dog.toString());
        }
        System.out.println(x.size());
    }
}


