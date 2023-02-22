package com.mycompany.incre;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private Label myLabel;
     @FXML
    private Button DecreaseButton;

    @FXML
    private Button increaseButton;
    double progress;
    @FXML
    
    
   
   
    void IncreaseProgress(ActionEvent event) {
      progress+=0.01;
      myProgressBar.setProgress(progress);
      myLabel.setText(Integer.toString((int)Math.round(progress*100)));
    }
    
    @FXML
    void DecreaseProgress(ActionEvent event) {
        progress-=0.01;
      myProgressBar.setProgress(progress);
      myLabel.setText(Integer.toString((int)Math.round(progress*100)));
    }
}
