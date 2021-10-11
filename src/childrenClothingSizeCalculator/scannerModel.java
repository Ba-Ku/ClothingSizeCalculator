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
            logInputToConsole(this.height, "height");
            enterMessage("waist measurments");
            this.waist = consoleInputScanner.nextFloat();
            logInputToConsole(this.waist, "waist");
            enterMessage("hips measurements");
            this.hips = consoleInputScanner.nextFloat();
            logInputToConsole(this.hips, "hips");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        consoleInputScanner.close();
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
