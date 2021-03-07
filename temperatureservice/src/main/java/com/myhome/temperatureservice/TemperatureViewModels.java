package com.myhome.temperatureservice;

import java.util.List;

public class TemperatureViewModels {

    private List<TemperatureViewModel> temperatureViewModels;

    public TemperatureViewModels() {
    }

    public List<TemperatureViewModel> getTemperatureViewModels() {
        return temperatureViewModels;
    }

    public void setTemperatureViewModels(List<TemperatureViewModel> temperatureViewModels) {
        this.temperatureViewModels = temperatureViewModels;
    }
}
