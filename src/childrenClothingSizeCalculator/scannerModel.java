package childrenClothingSizeCalculator;

import java.util.Scanner;

public class scannerModel implements messagesService {
    private float height;
    private float waist;
    private float hips;

    public scannerModel() {
    }

    public void getInputFromConsole() {

        Scanner consoleInputScanner = new Scanner(System.in);
        try {
            enterMessage("height");
            this.height = consoleInputScanner.nextFloat();
            boolean checkedHeight = this.checkInputHeight(this.height);
            if (checkedHeight == true) {
                logInputToConsole(this.height, "height");
            } else {
                consoleInputScanner.close();
                this.getInputFromConsole();
            }
            enterMessage("waist measurments");
            this.waist = consoleInputScanner.nextFloat();
            boolean checkedWaist = this.checkInputWaist(this.waist);
            if (checkedWaist == true) {
                logInputToConsole(this.waist, "waist");
            }
            enterMessage("hips measurements");
            this.hips = consoleInputScanner.nextFloat();
            boolean checkedHips = this.checkInputHips(this.hips);
            if (checkedHips == true) {
                logInputToConsole(this.hips, "hips");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        consoleInputScanner.close();
    }

    public boolean checkInputHeight(float inputHeight) throws Exception {
        if (inputHeight <= 0) {//Grenzwerttest
            throw new Exception("Height has to be bigger than 0!"); //exception bearbeiten
        } else if (inputHeight > 176) {//Grenzwerttest
            throw new Exception("Height has to be smaller than 176");
        } else {
            return true;
        }
    }

    public boolean checkInputWaist(float inputWaist) throws Exception {
        if (inputWaist <= 0) {//Grenzwerttest
            throw new Exception("Waist has to be bigger than 0!");
        } else if (inputWaist > 176) {//Grenzwerttest
            throw new Exception("Waist has to be smaller than 70");//CHECK MAXVALUE
        } else {
            return true;
        }
    }

    public boolean checkInputHips(float inputHips) throws Exception {
        if (inputHips <= 0) {//Grenzwerttest
            throw new Exception("Hips has to be bigger than 0!");
        } else if (inputHips > 176) {//Grenzwerttest
            throw new Exception("Hips has to be smaller than 60");//CHECK MAXVALUE
        } else {
            return true;
        }
    }

    public float getHeight() {
        return height;
    }

    public float getWaist() {
        return waist;
    }

    public float getHips() {
        return hips;
    }
}
