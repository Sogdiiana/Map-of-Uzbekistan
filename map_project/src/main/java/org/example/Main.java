package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Image image = new Image("https://cdn.vectorstock.com/i/500p/63/49/uzbekistan-map-vector-1606349.jpg");

        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(600);
        imageView.setFitWidth(800);

        imageView.setOnMouseClicked(event -> {
            double x = event.getX();
            double y = event.getY();

            double imageX = x / imageView.getFitWidth() * imageView.getImage().getWidth();
            double imageY = y / imageView.getFitHeight() * imageView.getImage().getHeight();

            System.out.println("Clicked pixel coordinates: (" + imageX + ", " + imageY + ")");
            if ((imageX < 85 && imageX > 3 && imageY < 245 && imageY >10 ) || (imageX > 85 && imageX < 188 && imageY < 185 && imageY > 0) || (imageX > 188 && imageX < 207 && imageY < 201 && imageY > 60) || (imageX > 207 && imageX < 232 && imageY < 227 && imageY > 85) || (imageX > 232 && imageX < 270 && imageY < 270 && imageY > 110)) {
                openStage1();
            } else if ((imageX > 270 && imageX < 427 && imageY < 255 && imageY > 115) || (imageX > 300 && imageX < 380 && imageY < 288 && imageY > 250) || (imageX > 388 && imageX < 478 && imageY < 300 && imageY > 217) || (imageX > 399 && imageX < 450 && imageY < 350 && imageY > 300)) {
                openStage8();
            } else if ((imageX > 270 && imageX < 305 && imageY < 330 && imageY > 285) || (imageX > 305 && imageX < 340 && imageY < 365 && imageY > 280) || (imageX > 340 && imageX < 385 && imageY < 390 && imageY > 280)|| (imageX > 395 && imageX < 417 && imageY < 315 && imageY > 298) || (imageX > 385 && imageX < 405 && imageY < 390 && imageY > 355)) {
                openStage5();
            } else if ((imageX > 410 && imageX < 510 && imageY < 370 && imageY > 340) ||  (imageX > 450 && imageX < 490 && imageY < 340 && imageY > 310)  ){
                openStage9();
            }else if ((imageX > 420 && imageX < 500 && imageY < 450 && imageY > 420)  || (imageX > 370 && imageX < 510 && imageY < 420 && imageY > 390) ||  (imageX > 400 && imageX < 520 && imageY < 400 && imageY > 370) ) {
                openStage3();
            } else if ((imageX > 470 && imageX < 540 && imageY < 490 && imageY > 450) ||  (imageX > 490 && imageX < 565 && imageY < 540 && imageY > 500) ||  (imageX > 510 && imageX < 550 && imageY < 500 && imageY > 390)) {
                openStage11();
            } else if ((imageX > 480 && imageX < 540 && imageY < 300 && imageY > 260) ||  (imageX > 480 && imageX < 570 && imageY < 355 && imageY > 340) ||  (imageX > 500 && imageX < 560 && imageY < 340 && imageY > 320) ||  (imageX > 489 && imageX < 541 && imageY < 320 && imageY > 300)) {
                openStage4();
            } else if ((imageX > 564 && imageX < 585 && imageY < 340 && imageY > 317) ||  (imageX > 540 && imageX < 585 && imageY < 317 && imageY > 295)  || (imageX > 560 && imageX < 575 && imageY < 295 && imageY > 275)) {
                openStage10();
            } else if ((imageX > 588 && imageX < 596 && imageY < 320 && imageY > 290)||   (imageX > 575 && imageX < 645 && imageY < 290 && imageY > 240) ||  (imageX > 600 && imageX < 630 && imageY < 240 && imageY > 220) ||  (imageX > 625 && imageX < 650 && imageY < 220 && imageY > 205) || (imageX > 650 && imageX < 670 && imageY < 205 && imageY > 190)) {
                openStage12();
            } else if ((imageX > 650 && imageX < 695 && imageY < 279 && imageY > 269)||  (imageX > 648 && imageX < 720 && imageY < 269 && imageY > 250) || (imageX > 245 && imageX < 660 && imageY < 250 && imageY > 235) || (imageX > 685 && imageX < 720 && imageY < 255 && imageY > 245) || (imageX > 692 && imageX < 710 && imageY < 245 && imageY > 230) ){
                openStage7();
            }else if ((imageX > 640 && imageX < 730 && imageY < 305 && imageY > 285) || (imageX > 660 && imageX < 718 && imageY < 310 && imageY > 280) ) {
                openStage6();
            } else if ((imageX > 696 && imageX < 764 && imageY < 280 && imageY > 265) || (imageX > 723 && imageX < 741 && imageY < 265 && imageY > 254) || (imageX > 727 && imageX < 745 && imageY < 295 && imageY > 280) ) {
                openStage13();
            } else if ((imageX > 180 && imageX < 220 && imageY < 260 && imageY > 240)||  (imageX > 180 && imageX < 205 && imageY < 220 && imageY > 210) || (imageX > 170 && imageX < 190 && imageY < 214 && imageY > 204)){
                openStage2();
            }


        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(imageView);
        borderPane.setPadding(new Insets(20));

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }

    private void openStage1() {
        Stage stage1 = new Stage();
        stage1.setTitle("Karakalpakstan ");

        GridPane gridPane = new GridPane();

        Label name = new Label("KARAKALPAKSTAN");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("160,000 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Arid, continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Nukus");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage1.setScene(scene);
        stage1.show();

    }
    private void openStage2() {
        Stage stage2 = new Stage();
        stage2.setTitle("Khorezm ");

        GridPane gridPane = new GridPane();

        Label name = new Label("XOREZM");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("44,700 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Arid, continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Urganch");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage2.setScene(scene);
        stage2.show();
    }
    private void openStage3() {
        Stage stage3 = new Stage();
        stage3.setTitle("Qashqadaryo ");

        GridPane gridPane = new GridPane();

        Label name = new Label("QASHQADARYO");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("28,400 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Qarshi");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage3.setScene(scene);
        stage3.show();
    }
    private void openStage4() {
        Stage stage4 =new Stage();
        stage4.setTitle("Jizzakh ");

        GridPane gridPane = new GridPane();

        Label name = new Label("JIZZAKH");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("20,500 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Jizzakh");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage4.setScene(scene);
        stage4.show();
    }
    private void openStage5() {
        Stage stage5 =new Stage();
        stage5.setTitle("Bukhara ");

        GridPane gridPane = new GridPane();

        Label name = new Label("BUKHARA");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("39,400 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Bukhara");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage5.setScene(scene);
        stage5.show();
    }
    private void openStage6() {
        Stage stage6 =new Stage();
        stage6.setTitle("Fergana ");

        GridPane gridPane = new GridPane();

        Label name = new Label("FERGANA");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("6,800 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Fergana");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage6.setScene(scene);
        stage6.show();
    }
    private void openStage7() {
        Stage stage7 =new Stage();
        stage7.setTitle("Namangan ");

        GridPane gridPane = new GridPane();

        Label name = new Label("NAMANGAN");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("7,900 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Namangan");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage7.setScene(scene);
        stage7.show();
    }
    private void openStage8() {
        Stage stage8 =new Stage();
        stage8.setTitle("Navoi ");

        GridPane gridPane = new GridPane();

        Label name = new Label("NAVOI");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("110,800 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Navoi");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage8.setScene(scene);
        stage8.show();
    }
    private void openStage9() {
        Stage stage9 =new Stage();
        stage9.setTitle("Samarkand ");

        GridPane gridPane = new GridPane();

        Label name = new Label("SAMARKAND");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("16,400 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Samarkand");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage9.setScene(scene);
        stage9.show();
    }
    private void openStage10() {
        Stage stage10 =new Stage();
        stage10.setTitle("Sirdarya ");

        GridPane gridPane = new GridPane();

        Label name = new Label("SIRDARYA");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("5,100 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Guliston");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage10.setScene(scene);
        stage10.show();
    }
    private void openStage11() {
        Stage stage11 =new Stage();
        stage11.setTitle("Surkhandarya ");

        GridPane gridPane = new GridPane();

        Label name = new Label("SURKHANDARYA");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("20,800 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Termez");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage11.setScene(scene);
        stage11.show();
    }
    private void openStage12() {
        Stage stage12 =new Stage();
        stage12.setTitle("Tashkent ");

        GridPane gridPane = new GridPane();

        Label name = new Label("TASHKENT");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("15,300 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Tashkent");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage12.setScene(scene);
        stage12.show();
    }
    private void openStage13() {
        Stage stage13 =new Stage();
        stage13.setTitle("Andijan ");

        GridPane gridPane = new GridPane();

        Label name = new Label("ANDIJAN");
        Label areaLabel = new Label("Area:");
        Label valueA = new Label("4,200 sq km");
        Label climateLabel = new Label("Climate:");
        Label valueCl = new Label("Continental climate");
        Label capitalLabel = new Label("Capital City:");
        Label valueCa = new Label("Andijan");

        gridPane.add(name, 0, 0, 2, 1);
        gridPane.add(areaLabel, 0, 1);
        gridPane.add(valueA, 2, 1);
        gridPane.add(capitalLabel, 0, 2);
        gridPane.add(valueCa, 2, 2);
        gridPane.add(climateLabel, 0, 3);
        gridPane.add(valueCl, 2, 3);

        Scene scene = new Scene(gridPane,300,100);
        stage13.setScene(scene);
        stage13.show();
    }

}