package racinggame.domain;

public class TryCount {
    private final int tryCount;

    public TryCount(int tryCount) {
        validateTryCount(tryCount);
        this.tryCount = tryCount;
    }

    public int getTryCount() {
        return tryCount;
    }

    private void validateTryCount(int tryCount) {
        if (tryCount <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1회 이상이어야 합니다.");
        }
    }
}
