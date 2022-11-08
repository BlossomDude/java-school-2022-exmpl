package ru.croc.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class task9 {
    public static void main(String[] args) {
        String way = "КРОК/работа/src/./../../универ/../../../мемы/котики";
        List<String> wayList = new ArrayList<>(List.of(way.split("/")));
        int i = 0;
        while (true) {
            if (Objects.equals(wayList.get(i), ".")) {
                wayList.remove(i);
            }
            if (Objects.equals(wayList.get(i), "..")) {
                if (i > 0) {
                    wayList.remove(i);
                    wayList.remove(i - 1);
                    --i;
                } else break;
            } else ++i;
        }

        String wayCut = String.join("/", wayList);
        System.out.println(wayCut);
    }
}
