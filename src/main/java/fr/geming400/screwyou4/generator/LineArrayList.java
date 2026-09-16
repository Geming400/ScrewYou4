package fr.geming400.screwyou4.generator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class LineArrayList extends ArrayList<String> {
    public static final int INDENT_SIZE = 4;

    private int currentIndentLevel = 0;

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

    /// Doesn't add {@code content} on a new line
    public boolean addIndented(String content) {
        return this.add(content.indent(this.currentIndentLevel * INDENT_SIZE));
    }

    public boolean addLine(String line) {
        return this.add((line + "\n").indent(this.currentIndentLevel * INDENT_SIZE));
    }

    public void addLines(String... lines) {
        Arrays.stream(lines).forEach(this::addLine);
    }

    /// Adds an empty line
    /// @see #addLine(String)
    public boolean addLine() {
        return this.add("\n");
    }

    public void setIndentLevel(int indentLevel) {
        this.currentIndentLevel = indentLevel;
    }

    public void indent() {
        this.currentIndentLevel++;
    }

    public void indent(int n) {
        this.currentIndentLevel += n;
    }

    public void unindent() {
        this.currentIndentLevel = Math.max(this.currentIndentLevel - 1, 0);
    }

    public void unindent(int n) {
        this.currentIndentLevel = Math.max(this.currentIndentLevel - n, 0);
    }

    public int getIndentLevel() {
        return this.currentIndentLevel;
    }

    public static LineArrayList fromString(String str) {
        return new LineArrayList(str.lines().toList());
    }
}
