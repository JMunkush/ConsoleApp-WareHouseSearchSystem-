package io.munkush.app.starter;

import io.munkush.app.view.WareHouseSearchSystemView;

public class WareHouseSearchSystemStarter {
    public static final WareHouseSearchSystemView view = new WareHouseSearchSystemView();

    public static void run(){
        view.start();
    }
}
