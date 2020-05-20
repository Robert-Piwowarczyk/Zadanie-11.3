class ResultOperation {
    private int first;
    private int second;
    private String operation;
    private int result;

    public ResultOperation(int first,int second, String operation, int result) {
        this.first = first;
        this.second = second;
        this.operation = operation;
        this.result = result;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public String getOperation() {
        return operation;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return first + " " + operation + " " + second + " = " + result;
    }
}