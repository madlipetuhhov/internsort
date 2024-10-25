package org.example;

public enum Food {
    ITALIAN(1),
    MEXICAN(2),
    ASIAN(3),
    INDIAN(4),
    JAPANESE(5),
    EUROPEAN(6);

    final int order;

    Food(int order) {
        this.order = order;
    }
}
