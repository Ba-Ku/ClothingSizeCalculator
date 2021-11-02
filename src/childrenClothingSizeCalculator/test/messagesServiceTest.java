package childrenClothingSizeCalculator.test;

import childrenClothingSizeCalculator.messagesService;

class messagesServiceTest {
    messagesService messagesServiceUnderTest = new messagesService() {
        @Override
        public void enterMessage(String inputText) {
            messagesService.super.enterMessage(inputText);
        }

        @Override
        public void logInputToConsole(float inputFloat, String inputText) {
            messagesService.super.logInputToConsole(inputFloat, inputText);
        }
    };

    /*ähnlich gelagertes Problem wie bei consoleView - wie teste ich einen console log*/
}