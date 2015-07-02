package com.github.finder;

import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.CmdLineException;

public class Main{
    public Main(String[] arguments)
    {
        Args args = parseArguments(arguments);
    }
    private Args parseArguments(String[] arguments) throws CmdLineException
    {
        Args args = new Args();
        CmdLineParser parser = new CmdLineParser(args);
        parser.parserArgument(arguments);
        
        return args;
        
        
    }

    public static void main(String[] args)
    {
        //Mainクラスのコンストラクタを呼び出す
        new Main(args);
        
    }
}
