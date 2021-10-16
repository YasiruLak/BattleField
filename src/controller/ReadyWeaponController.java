package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import weapon.Weapon;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ReadyWeaponController {
    public CheckBox cmbT56A;
    public CheckBox cmbTankA;
    public CheckBox cmbMultiBarrelA;
    public CheckBox cmbPistolA;
    public CheckBox cmbBombA;
    public CheckBox cmbT56B;
    public CheckBox cmbTankB;
    public CheckBox cmbMultiBarrelB;
    public CheckBox cmbPistolB;
    public CheckBox cmbBombB;
    public AnchorPane readyWeaponPageContext;

    static ArrayList<Weapon> weaponArrayList = new ArrayList<>();

    public void openBattleStart(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LastPage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) readyWeaponPageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
