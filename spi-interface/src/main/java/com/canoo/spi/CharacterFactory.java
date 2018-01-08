package com.canoo.spi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public class CharacterFactory {

    public static List<Character> getAllCharacters() {
        final List<Character> result = new ArrayList<>();
        final ServiceLoader<Character> loader = ServiceLoader.load(Character.class);
        final Iterator<Character> iterator = loader.iterator();

        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }
}
