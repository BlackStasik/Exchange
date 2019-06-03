import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class ModelController {

    int couter = 0;

    static int capital = 5000000;
    static int[] users = {12000, 53000, 25000, 38000, 143200, 72500, 61200, 82900, 26000, 299000,143200,72500,300500,15000,156000};
    static int[][] usActions = {{1000, -600, -400, 3000, 800, -1504, -506, 1200, 900, -1050, 950, 450, -1200, 600, 150},
            {500,  100,  -250,  200,  100,  -50,   350,  600,  -900,  405, 500,  100,  -250,  200,  100},
            {600, 200, -1000, 430, 150, 1500, -800, 1300, -500, 290, -1000, 430, 1050, 1500, -800},
            {6000, 1200, -1500, 1430, 1500, 1200, -5000, 1300, -1500, 2090, 1200, -5000, 1300, 6000, 1200},
            {14000, 4500,  -39000,  8000, 25000, 4500, -6200, 15000, -2400, -12000, 4500, -6200, 15000, -2400, -12000},
            {6500, 1200, -1500, 1430, -1500, 1500, -5000, 1300, -1500, 1090, 6000, 200, -100, 300, -500},
            {90, 60, -150, 200, -80, -175, 56, 120, -90, 600, 1000, -600, -400, 3000, 800},
            {6500, 1200, -1500, 1430, -1500, 1500, -500, 6300, -9500, 590, 1200, -500, 300, -1500, 2090},
            {6000, 200, -100, 300, -500, 1200, -500, 300, -1500, 2090, 1200, -500, 300, -1500, 2090},
            {30000, 4500,  -39000,  80000, 25000, 4500, 60000, 15000, -2400, -12000, -1500, 1430, -1500, 1500, -500},
            {14000, 4500,  -39000,  8000, 25000, 4500, -6200, 15000, -2400, -12000, 20000, 4500,  -39000,  80000, 10000},
            {6000, 1200, -1500, 1430, 1500, 1200, -5000, 1300, -1500, 2090, -6200, 15000, -2400, -12000, 20000},
            {20000, 4500,  -39000,  80000, 10000, 4500, 60000, 15000, -2400, -12000, -5000, 1300, -1500, 2090, -6200},
            {1000, -600, -400, 3000, 800, -1504, -506, 1200, 900, -1050, -5000, 1300, -1500, 2090, -6200},
            {30000, 4500,  -39000,  80000, 25000, 4500, 60000, 15000, -2400, -12000, 25000, 4500, 60000, 15000, -2400}};
    static int used = Sum.sum(users);
    static int free = capital-used;
    static int exRate = ((used * 100)/capital)*100;


    @FXML
    Button next;

    @FXML
    BarChart bar;

    @FXML
    BarChart actions;

    @FXML
    LineChart kncoin;

    XYChart.Series bardata = new XYChart.Series();
    XYChart.Series actionsData = new XYChart.Series();
    XYChart.Series coindata = new XYChart.Series();

    @FXML
    Label cap;

    @FXML
    Label fr;

    @FXML
    Label us;

    @FXML
    Label rate;

    public void initialize() {
        for(int i = 0; i < 15; i++){
            bardata.getData().add(new XYChart.Data("User " + (i+1), users[i]));
        }
        bar.getData().add(bardata);
        for(int i = 0; i < 15; i++){
            actionsData.getData().add(new XYChart.Data("User " + (i+1), usActions[i][couter]));
        }
        actions.getData().add(actionsData);
        coindata.getData().add(new XYChart.Data("Крок " + (couter), exRate));
        kncoin.getData().add(coindata);
        cap.setText(capital+"");
        fr.setText(free+"");
        us.setText(used+"");
        rate.setText(exRate+"");
        for(int j = 0; j < 15; j++){
            users[j] += usActions[j][couter];
        }
        used = Sum.sum(users);
        free = capital-used;
        exRate = ((used * 100)/capital)*100;
        couter++;
        if(couter == 15){
            next.setText("Закрити");
        }
    }



    @FXML
    public void next(){
        if(couter == 15){
            MainController.stage.close();
        }
        initialize();
    }


}
