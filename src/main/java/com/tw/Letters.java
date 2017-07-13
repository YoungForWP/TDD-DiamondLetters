package com.tw;

public class Letters {
    private static final String lineBreak = "\n";
    private static final String blankSpace = " ";
    private static final String star = "*";
    private String letters = "ABCDEFJHIGKLMNOPQRSTUVWXYZ";
    private char[] lettersCollection = letters.toCharArray();

    public String output(Character inputLetter) {
        int index = letters.indexOf(inputLetter);
        if (index >= 0) {
            return generateOutput(index, blankSpace);
        }
        return null;
    }

    public String outputSuperStar(Character inputLetter) {
        int index = letters.indexOf(inputLetter);
        if (index >= 0) {
            return generateOutput(index, star);
        }
        return null;
    }

    private String generateOutput(int index, String symbol) {
        StringBuilder output = generateOrderSection(index, symbol);
        return generateReverseSection(output).toString();
    }

    private StringBuilder generateReverseSection(StringBuilder output) {
        StringBuilder result = new StringBuilder(output);
        String[] reverse = result.toString().split(lineBreak);
        for (int index = reverse.length - 2; index >= 0; index--) {
            result.append(lineBreak).append(reverse[index]);
        }
        return result;
    }

    private StringBuilder generateOrderSection(int index, String symbol) {
        StringBuilder output = new StringBuilder();
        int leftSpace = 1;
        int middleSpace = 1;
        for (int i = 0; i <= index; i++) {
            if (i == 0) {
                output.append(generateSymbolSpace(index, blankSpace)).append(lettersCollection[i]);
            } else {
                output.append(lineBreak).append(generateSymbolSpace(index - leftSpace++, blankSpace))
                        .append(lettersCollection[i])
                        .append(generateSymbolSpace(middleSpace, symbol))
                        .append(lettersCollection[i]);
                middleSpace += 2;
            }
        }
        return output;
    }

    private String generateSymbolSpace(int spaceAmount, String symbol) {
        StringBuilder output = new StringBuilder();
        for (int amount = spaceAmount; amount > 0; amount--) {
            output.append(symbol);
        }
        return output.toString();
    }
}
