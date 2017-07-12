package com.tw;

public class Letters {
    private static final String lineBreak = "\n";
    private static final String blankSpace = " ";
    private String letters = "ABCDEFJHIGKLMNOPQRSTUVWXYZ";
    private char[] lettersCollection = letters.toCharArray();

    public String output(Character inputLetter) {
        int index = letters.indexOf(inputLetter);
        if (index >= 0) {
            return generateOutput(index);
        }
        return null;
    }

    private String generateOutput(int index) {
        StringBuilder output = generateOrderSection(index);
        return generateReverseSection(output).toString();
    }

    private StringBuilder generateReverseSection(StringBuilder output) {
        String[] reverse = output.toString().split(lineBreak);
        for (int index = reverse.length - 2; index >= 0; index--) {
            output.append(lineBreak).append(reverse[index]);
        }
        return output;
    }

    private StringBuilder generateOrderSection(int index) {
        StringBuilder output = new StringBuilder();
        int leftSpace = 1;
        int middleSpace = 1;
        for (int i = 0; i <= index; i++) {
            if (i == 0) {
                output.append(generateBlankSpace(index)).append(lettersCollection[i]);
            } else {
                output.append(lineBreak).append(generateBlankSpace(index - leftSpace++))
                        .append(lettersCollection[i])
                        .append(generateBlankSpace(middleSpace))
                        .append(lettersCollection[i]);
                middleSpace += 2;
            }
        }
        return output;
    }

    private String generateBlankSpace(int spaceAmount) {
        StringBuilder output = new StringBuilder();
        for (int amount = spaceAmount; amount > 0; amount--) {
            output.append(blankSpace);
        }
        return output.toString();
    }
}
