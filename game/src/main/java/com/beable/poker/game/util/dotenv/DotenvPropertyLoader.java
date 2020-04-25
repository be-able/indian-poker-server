package com.beable.poker.game.util.dotenv;

import io.github.cdimascio.dotenv.Dotenv;

public class DotenvPropertyLoader {

    private Dotenv dotenv;

    public DotenvPropertyLoader() {
        dotenv = Dotenv.configure().ignoreIfMissing().load();
    }

    public Object getValue(String key) {
        return dotenv.get(key);
    }
}
