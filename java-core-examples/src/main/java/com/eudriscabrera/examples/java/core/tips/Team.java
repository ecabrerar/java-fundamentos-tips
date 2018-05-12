package com.eudriscabrera.examples.java.core.tips;

import com.google.common.base.Objects;

/**
 * @author ecabrerar
 * @date Mar 27, 2015
 */
public class Team {

    private String teamId;
    private String name;
    private boolean hasWonWoldSeries;
    private Integer lastTimeWonWorldSeries;

    public Team(String teamId, String name, boolean hasWonWoldSeries, Integer lastTimeWonWorldSeries) {
        this.teamId = teamId;
        this.name = name;
        this.hasWonWoldSeries = hasWonWoldSeries;
        this.lastTimeWonWorldSeries = lastTimeWonWorldSeries;
    }


    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasWonWoldSeries() {
        return hasWonWoldSeries;
    }

    public void setHasWonWoldSeries(boolean hasWonWoldSeries) {
        this.hasWonWoldSeries = hasWonWoldSeries;
    }

    public Integer getLastTimeWonWorldSeries() {
        return lastTimeWonWorldSeries;
    }

    public void setLastTimeWonWorldSeries(Integer lastTimeWonWorldSeries) {
        this.lastTimeWonWorldSeries = lastTimeWonWorldSeries;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("id").append(teamId)
                .append("name").append(name)
                .append("hasWonWoldSeries").append(hasWonWoldSeries)
                .append("lastTimeWonWorldSeries").append(lastTimeWonWorldSeries)
                .toString();
    }
}
