package by.bsuir.dubitskaya.task3.table;

import java.util.Map;

public class TableBuilder {
    public static String getTable(Map<Double, Double> map) {
        if (map == null) {
            throw new IllegalArgumentException("Invalid argument: map is null.");
        }

        StringBuilder sb = new StringBuilder();
        sb.append(" x            tg(x)\n");
        for (Map.Entry<Double, Double> entry: map.entrySet()) {
            sb.append(entry.getKey())
              .append("          ")
              .append(entry.getValue())
              .append('\n');
        }

        return sb.toString();
    }
}
