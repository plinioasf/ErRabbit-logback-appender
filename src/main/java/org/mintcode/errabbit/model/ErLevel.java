package org.mintcode.errabbit.model;

import ch.qos.logback.classic.Level;

import java.io.Serializable;

/**
 * Model for ch.qos.logback.classic.Level
 */
public class ErLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int level;
    private String levelStr;

    public ErLevel(){}

    /***
     * Generate from ch.qos.logback.classic.Level
     * @param level
     * @return
     */
    public static ErLevel fromLevel(Level level){

        if (level == null){
            return null;
        }

        ErLevel erLevel = new ErLevel();
        erLevel.setLevel(level.toInt());
        erLevel.setLevelStr(level.toString());
        return erLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevelStr() {
        return levelStr;
    }

    public void setLevelStr(String levelStr) {
        this.levelStr = levelStr;
    }

    @Override
    public String toString() {
        return levelStr;
    }
}
