package programming_with_classes.classes_and_objects.Task_5;

public class Counter {
    private int min;
    private int max;
    private int now;

    public Counter() {
        min = 0;
        max = 10;
        now = 5;
    }

    public Counter(int min, int max, int counter) {
        this.min = min;
        this.max = max;
        this.now = counter;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getNow() {
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }

    public void decrease() {
        now--;
        if (now < min) {
            now = max;
        }
    }

    public void increase() {
        now++;
        if (now > max) {
            now = min;
        }
    }

}
