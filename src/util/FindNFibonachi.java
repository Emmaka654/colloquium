package util;

public class FindNFibonachi {

    private final long id;
    private final double answer;
    public FindNFibonachi(long id, long answer) {
        this.id = id;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public double getAnswer() {
        return answer;
    }
}