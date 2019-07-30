package sk.me;

import sk.me.patterns.creational.abstract_factory.AbstractFactoryPatternDemo;
import sk.me.patterns.creational.builder.BuilderPatternDemo;
import sk.me.patterns.creational.factory.FactoryPatternDemo;
import sk.me.patterns.creational.prototype.PrototypePatternDemo;
import sk.me.patterns.creational.singleton.SingletonPatternDemo;
import sk.me.patterns.structural.adapter.AdapterPatternDemo;
import sk.me.patterns.structural.bridge.BridgePatternDemo;

public class Main {

    public static void main(String[] args) {
        // Run FactoryPatternDemo
        System.out.println("***Begin FactoryPatternDemo***");
        FactoryPatternDemo.main(new String[]{});
        System.out.println("***End FactoryPatternDemo***\n\n");
        // Run AbstractFactoryPatternDemo
        System.out.println("***Begin AbstractFactoryPatternDemo***");
        AbstractFactoryPatternDemo.main(new String[]{});
        System.out.println("***End AbstractFactoryPatternDemo***\n\n");
        // Run SingletonPatternDemo
        System.out.println("***Begin SingletonPatternDemo***");
        SingletonPatternDemo.main(new String[]{});
        System.out.println("***End SingletonPatternDemo***\n\n");
        // Run BuilderPatternDemo
        System.out.println("***Begin BuilderPatternDemo***");
        BuilderPatternDemo.main(new String[]{});
        System.out.println("***End BuilderPatternDemo***\n\n");
        // Run PrototypePatternDemo
        System.out.println("***Begin PrototypePatternDemo***");
        PrototypePatternDemo.main(new String[]{});
        System.out.println("***End PrototypePatternDemo***\n\n");
        // Run AdapterPatternDemo
        System.out.println("***Begin AdapterPatternDemo***");
        AdapterPatternDemo.main(new String[]{});
        System.out.println("***End AdapterPatternDemo***\n\n");
        // Run BridgePatternDemo
        System.out.println("***Begin BridgePatternDemo***");
        BridgePatternDemo.main(new String[]{});
        System.out.println("***End BridgePatternDemo***\n\n");
    }
}
