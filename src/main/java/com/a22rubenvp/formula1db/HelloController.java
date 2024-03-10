package com.a22rubenvp.formula1db;

import com.a22rubenvp.formula1db.model.dao.DriverDao;
import com.a22rubenvp.formula1db.model.dao.LapTimeDao;
import com.a22rubenvp.formula1db.model.dao.RaceDao;
import com.a22rubenvp.formula1db.model.dao.SeasonDao;
import com.a22rubenvp.formula1db.model.dto.DriverDto;
import com.a22rubenvp.formula1db.model.dto.LapTimeDto;
import com.a22rubenvp.formula1db.model.dto.RaceDto;
import com.a22rubenvp.formula1db.model.dto.SeasonDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;

import java.util.List;

public class HelloController {

    @FXML
    private ComboBox driverCB;
    @FXML
    private ComboBox yearCB;
    @FXML
    private ComboBox raceCB;
    @FXML
    private LineChart lapsAC;
    @FXML
    private CheckBox acumulableCB;

    public void initialize() {
        SeasonDao sdao = new SeasonDao();
        List<SeasonDto> seasons = sdao.findAll();
        for (SeasonDto s : seasons) {
            yearCB.getItems().add(s.getId());
        }
    }

    @FXML
    public void selectRace(ActionEvent actionEvent) {
        RaceDao rdao = new RaceDao();
        List<RaceDto> races = rdao.findByYear(Integer.parseInt(yearCB.getSelectionModel().getSelectedItem().toString()));
        raceCB.getItems().clear();
        for (RaceDto r : races) {
            raceCB.getItems().add(r.getName());
        }
        if (!raceCB.getItems().isEmpty()) {
            raceCB.getSelectionModel().selectFirst();
        }
    }

    @FXML
    public void updateChart(ActionEvent actionEvent) {
        LapTimeDao ltdao = new LapTimeDao();
        String[] driver = driverCB.getSelectionModel().getSelectedItem().toString().split(" ");
        if (!acumulableCB.isSelected()) {
            lapsAC.getData().clear();
        }
        List<LapTimeDto> lapTimes = ltdao.findByDRS(
                driver[0],
                raceCB.getSelectionModel().getSelectedItem().toString(),
                Integer.parseInt(yearCB.getSelectionModel().getSelectedItem().toString()));
        XYChart.Series laps = new XYChart.Series();
        laps.setName(driverCB.getSelectionModel().getSelectedItem().toString());
        for (LapTimeDto lap : lapTimes) {
            Number l = lap.getIdLap();
            Number time = lap.getMilliseconds();
            laps.getData().add(new XYChart.Data(l.toString(), time));
        }
        lapsAC.setTitle("Lap Times");
        lapsAC.getData().add(laps);
    }

    @FXML
    public void selectDriver(ActionEvent actionEvent) {
        DriverDao ddao = new DriverDao();
        List<DriverDto> drivers = ddao.findBySeason(Integer.parseInt(yearCB.getSelectionModel().getSelectedItem().toString()));
        driverCB.getItems().clear();
        for (DriverDto d : drivers) {
            driverCB.getItems().add(d.getForename() + " " + d.getSurname());
        }
    }
}