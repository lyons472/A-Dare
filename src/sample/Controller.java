package sample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Controller {

    @FXML
    public void changeToPath0_Scene1(ActionEvent event) throws IOException
    {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Path0_Scene1.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch(Exception e) {
            System.out.println("Can't load new window.\n"+e.getMessage());
        }
    }
    @FXML
    public void changeToPath0_Scene2(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Path0_Scene2.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    @FXML
    public void changeToPath0_Scene3(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Path0_Scene3.fxml"));
            Parent root3 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(root3));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    @FXML
    public void changeToEnding1(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ending1.fxml"));
            Parent roote1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(roote1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    @FXML
    public void changePath0_Scene4(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Path0_Scene4.fxml"));
            Parent root4 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(root4));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    @FXML
    public void changeToEnding2(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ending2.fxml"));
            Parent roote2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(roote2));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    public void changeToXD(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("XD.fxml"));
            Parent rootxd = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(rootxd));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    public void changeToPath1_Scene1(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Path1_Scene1.fxml"));
            Parent root11 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(root11));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    public void changeToPath1_Scene2(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Path1_Scene2.fxml"));
            Parent root12 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(root12));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    public void changeToEnding3(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ending3.fxml"));
            Parent roote3 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(roote3));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    public void changeToEnding4(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ending4.fxml"));
            Parent roote4 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(roote4));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    public void changeToEnding5(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ending5.fxml"));
            Parent roote5 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(roote5));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }

    public void changeToEnding6(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Ending6.fxml"));
            Parent roote6 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("A Dare");
            stage.setScene(new Scene(roote6));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.\n" + e.getMessage());
        }
    }
}
