package com.company.structural.flywight;

import java.util.HashMap;

public class EnemyFactory {
    private static HashMap<String, Enemy> enemies = new HashMap<>();

    public static Enemy getEnemy(String type) {
        Enemy enemy = null;

        if (enemies.containsKey(type)) {
            enemy = enemies.get(type);
        } else {
            switch (type) {
                case "Private":
                    System.out.println("Un soldado ha sido creado");
                    enemy = new Private();
                    break;
                case "Detective":
                    System.out.println("Un detective ha sido creado");
                    enemy = new Detective();
                    break;
            }

            enemies.put(type, enemy);
        }

        return enemy;
    }

}
