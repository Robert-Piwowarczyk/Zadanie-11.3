class ParserOperation {

    static ResultOperation[] parseOperations(String[] sourceOperations) {
        ResultOperation[] result = new ResultOperation[sourceOperations.length];
        for (int i = 0; i < sourceOperations.length; i++) {
            String[] split = sourceOperations[i].split(" ");
            int first = (int) Double.parseDouble(split[0]);
            int second = (int) Double.parseDouble(split[2]);
            try {
                int operationResult = (int) calculateResult(first, second, split[1]);
                result[i] = new ResultOperation(first, second, split[1], operationResult);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        return result;
    }

    private static double calculateResult(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException(operator + " is not a math operator");
        }
    }

}