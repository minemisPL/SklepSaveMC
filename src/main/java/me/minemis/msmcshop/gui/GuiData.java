package me.minemis.msmcshop.gui;

import me.minemis.msmcshop.gui.clickExecutors.ClickExecutor;
import me.minemis.msmcshop.gui.creators.GuiCreator;

public class GuiData {
    private final GuiCreator creator;
    private final ClickExecutor executor;

    public GuiData(GuiCreator creator, ClickExecutor executor) {
        this.creator = creator;
        this.executor = executor;
    }

    public ClickExecutor getExecutor() {
        return executor;
    }

    public GuiCreator getCreator() {
        return creator;
    }
}
