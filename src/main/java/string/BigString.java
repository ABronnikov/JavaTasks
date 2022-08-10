package string;

import java.util.Objects;

public class BigString {

    private int length;
    private String value;

    public BigString(int length, String value) {
        this.length = length;
        this.value = value;
    }

    public int getLength() {
        return length;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BigString bigString = (BigString) o;
        return getLength() == bigString.getLength() && getValue().equals(bigString.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getValue());
    }

    @Override
    public String toString() {
        return "BigString{" +
                "length=" + length +
                ", value='" + value + '\'' +
                '}';
    }
}
