package scim;

import apg.Parser;

import java.io.PrintStream;

public class testFilter {

    public static void main(String[] args) {
        int startRule = Filter.RuleNames.PATH.ruleID();
        Parser parser = new Parser(Filter.getInstance());
        parser.setStartRule(startRule);
        parser.setInputString("name.familyName");
        try {
            Parser.Result result = parser.parse();
            PrintStream out = System.out;
            result.displayResult(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
