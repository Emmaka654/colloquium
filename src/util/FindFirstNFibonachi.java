package util;

import java.util.ArrayList;

public class FindFirstNFibonachi {
    private final long id;
    private final ArrayList<Long> answer;
    public FindFirstNFibonachi(long id, ArrayList<Long> answer) {
        this.id = id;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Long> getAnswer() {
        return answer;
    }
}
