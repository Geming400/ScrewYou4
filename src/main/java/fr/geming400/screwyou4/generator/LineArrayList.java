package fr.geming400.screwyou4.generator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class LineArrayList extends ArrayList<String> {
    public LineArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public LineArrayList() {}

    public LineArrayList(@NotNull Collection<? extends String> c) {
        super(c);
    }

    public String joinLines() {
        return String.join("", this);
    }

    public boolean addLine(String line) {
        return this.add(line + "\n");
    }

    public void addLines(String... lines) {
        Arrays.stream(lines).forEach(this::addLine);
    }

    /// Adds an empty line
    /// @see #addLine(String)
    public boolean addLine() {
        return this.add("\n");
    }

    public static LineArrayList fromString(String str) {
        return new LineArrayList(str.lines().toList());
    }
}
