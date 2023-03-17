package org.example;
import attribute.Core;
import attribute.Wand;
import lombok.*;
import lombok.Getter;
import lombok.Setter.*;
public class Main {
    public static void main(String[] args) {
        Core core = new Core(Core.PHOENIX_FEATHER);
        Wand wand = new Wand(10, core);
        System.out.println(wand.getDescription());
    }
}
