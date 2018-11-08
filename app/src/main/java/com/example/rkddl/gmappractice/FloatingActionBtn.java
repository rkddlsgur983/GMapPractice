package com.example.rkddl.gmappractice;

import android.support.design.widget.FloatingActionButton;
import android.view.animation.Animation;

public class FloatingActionBtn {
    private Animation fabOpen, fabClose;
    private Boolean isFabOpen = false;
    private FloatingActionButton fabMenu, fabGPS, fabPick, fabClear, fabFull;

    public FloatingActionButton getFabMenu() {
        return fabMenu;
    }

    public void setFabOpen(Animation fabOpen) {
        this.fabOpen = fabOpen;
    }

    public void setFabClose(Animation fabClose) {
        this.fabClose = fabClose;
    }

    public void setFabMenu(FloatingActionButton fab) {
        this.fabMenu = fab;
    }

    public FloatingActionButton getFabGPS() {
        return fabGPS;
    }

    public void setFabGPS(FloatingActionButton fabGPS) {
        this.fabGPS = fabGPS;
    }

    public FloatingActionButton getFabPick() {
        return fabPick;
    }

    public void setFabPick(FloatingActionButton fabPick) {
        this.fabPick = fabPick;
    }

    public FloatingActionButton getFabClear() {
        return fabClear;
    }

    public void setFabClear(FloatingActionButton fabClear) {
        this.fabClear = fabClear;
    }

    public FloatingActionButton getFabFull() {
        return fabFull;
    }

    public void setFabFull(FloatingActionButton fabFull) {
        this.fabFull = fabFull;
    }

    public void anim() {
        if (isFabOpen) {
            fabGPS.startAnimation(fabClose);
            fabPick.startAnimation(fabClose);
            fabClear.startAnimation(fabClose);
            fabFull.startAnimation(fabClose);
            fabGPS.setClickable(false);
            fabPick.setClickable(false);
            fabClear.setClickable(false);
            fabFull.setClickable(false);
            isFabOpen = false;
        } else {
            fabGPS.startAnimation(fabOpen);
            fabPick.startAnimation(fabOpen);
            fabClear.startAnimation(fabOpen);
            fabFull.startAnimation(fabOpen);
            fabGPS.setClickable(true);
            fabPick.setClickable(true);
            fabClear.setClickable(true);
            fabFull.setClickable(true);
            isFabOpen = true;
        }
    }
}
