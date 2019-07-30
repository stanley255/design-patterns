package sk.me;

import sk.me.patterns.creational.abstract_factory_parrent.AbstractFactoryPatternDemo;
import sk.me.patterns.creational.factory_pattern.FactoryPatternDemo;

public class Main {

    public static void main(String[] args) {
        // Run FactoryPatternDemo
        System.out.println("***Begin FactoryPatternDemo***");
        FactoryPatternDemo.main(new String[]{});
        System.out.println("***End FactoryPatternDemo***");
        // Run AbstractFactoryPatternDemo
        System.out.println("***Begin AbstractFactoryPatternDemo***");
        AbstractFactoryPatternDemo.main(new String[]{});
        System.out.println("***End AbstractFactoryPatternDemo***");
    }
}
