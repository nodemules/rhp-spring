package com.nodemules.rhp.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * @author brent
 * @since 7/26/17.
 */
@Component
public final class PrintUtil {

  private static final Integer MAX_STRING_BUFFER_SIZE = 65535;
  private static final Integer MIN_STRING_BUFFER_SIZE = 16;
  private static final Integer DEFAULT_LINE_LENGTH = 64;
  private static final Integer MIN_WIDTH_BUFFER = 3;
  private static final Integer MIN_LINES_BUFFER = 1;


  private static final char DEFAULT_CHAR = '=';
  private static final Line DEFAULT_LINE;

  @Getter(AccessLevel.PRIVATE)
  private int customLineLength;

  @Getter(AccessLevel.PRIVATE)
  private char customChar;

  @Getter(AccessLevel.PRIVATE)
  private static Line customLine;

  static {
    DEFAULT_LINE = repeat(DEFAULT_CHAR, DEFAULT_LINE_LENGTH);
  }

  @Data
  @AllArgsConstructor
  private static class Line {
    private char c;
    private int length;
    private String line;

    @Override
    public String toString() {
      return this.line;
    }
  }

  private PrintUtil() {
    /* empty constructor */
  }

  private static Line repeat(char c, int repititions) {
    StringBuilder sb = new StringBuilder(repititions + MIN_STRING_BUFFER_SIZE);
    for (int i = 0; i < repititions; i++) {
      sb.append(c);
    }
    return new Line(c, repititions, sb.toString());
  }

  public void setCustomChar(char c) {
    this.customChar = c;
    setCustomLine();
  }

  public void setCustomLineLength(int i) {
    this.customLineLength = i;
    setCustomLine();
  }

  private void setCustomLine() {
    setCustomLine(this.customChar, this.customLineLength);
  }

  public void setCustomLine(char c, int i) {
    this.customChar = c;
    this.customLineLength = i;
    this.customLine = repeat(this.customChar != Character.MIN_VALUE ? this.customChar : DEFAULT_CHAR, customLineLength > 0 ?  customLineLength : DEFAULT_LINE_LENGTH);
  }

  public static void bufferLines(StringBuilder sb, String line, String content) {
    bufferLines(sb, line, content, MIN_WIDTH_BUFFER, MIN_LINES_BUFFER);
  }

  public static void bufferLines(StringBuilder sb, String line, int bufferLines) {
    bufferLines(sb, line, MIN_WIDTH_BUFFER, bufferLines);
  }

  public static void bufferWidth(StringBuilder sb, String line, int bufferWidth) {
    bufferWidth(sb, line, null, bufferWidth);
  }

  public static void bufferWidth(StringBuilder sb, String line, String content, int bufferWidth) {
    bufferLines(sb, line, content, bufferWidth, MIN_LINES_BUFFER);
  }

  public static void bufferLines(StringBuilder sb, String line, int bufferWidth, int bufferLines) {
    bufferLines(sb, line, null, bufferWidth, bufferLines);
  }

  public static void bufferLines(StringBuilder sb, String line, String content, int bufferWidth, int bufferLines) {
    for (int i = 0; i < bufferLines; i++) {
      for (int j = 0; j < bufferWidth; j++) {
        if (content != null && isHalfway(bufferWidth, j)) {
          sb.append(content);
        } else {
          sb.append(line);
        }
      }
      sb.append("\n");
    }

  }

  private static boolean isHalfway(int total, int current) {
    return total - current == current + 1;
  }
}
