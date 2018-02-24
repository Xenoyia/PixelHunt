package com.xpgaming.PixelHunt.Enums;

public enum EnumItems {
        level_ball,
        moon_ball,
        friend_ball,
        love_ball,
        timer_ball,
        nest_ball,
        net_ball,
        dive_ball,
        luxury_ball,
        heal_ball,
        dusk_ball,
        lure_ball,
        sport_ball,
        ultra_ball,
        great_ball,
        quick_ball,
        heavy_ball,
        fast_ball,
        repeat_ball;

        private EnumItems() {
        }

    public static boolean hasItem(String name) {
        try {
            return valueOf(name) != null;
        } catch (Exception var2) {
            return false;
        }
    }
}
