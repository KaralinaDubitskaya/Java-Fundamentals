package by.bsuir.dubitskaya.task3.table;

import by.bsuir.dubitskaya.task3.util.TanFunction;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class TableBuilderTest {

    @Test
    void getTable() {
        assertThrows(IllegalArgumentException.class, () -> TableBuilder.getTable(null));
        assertEquals(" x            tg(x)\n", TableBuilder.getTable(new TreeMap<>()));
        Map<Double, Double> map = new TreeMap<Double, Double>();
        map.put(1.2, 1.45);
        map.put(11.0, 6.8);
        String result = " x            tg(x)\n1.2          1.45\n11.0          6.8\n";
        assertEquals(result, TableBuilder.getTable(map));
    }
}