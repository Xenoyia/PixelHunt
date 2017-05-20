package com.xpgaming.xPHunt.Enums;

public enum EnumRareItems {
        ultra_ball,
        quick_ball,
        heavy_ball,
        fast_ball,
        repeat_ball,
        gs_ball;

        private EnumRareItems() {
        }

    public static boolean hasItem(String name) {
        try {
            return valueOf(name) != null;
        } catch (Exception var2) {
            return false;
        }
    }
}
