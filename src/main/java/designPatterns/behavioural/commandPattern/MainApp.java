package designPatterns.behavioural.commandPattern;

import designPatterns.behavioural.commandPattern.command.Command;
import designPatterns.behavioural.commandPattern.command.CurtainCloseCommand;
import designPatterns.behavioural.commandPattern.command.LightsSwitchCommand;
import designPatterns.behavioural.commandPattern.invoker.KitchenRoom;
import designPatterns.behavioural.commandPattern.invoker.LivingRoom;
import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        Command livingRoomSwitchLightsCommand = new LightsSwitchCommand(livingRoom.getLight());
        Command livingRoomMoveCurtainsCommand = new CurtainCloseCommand(livingRoom.getCurtain());
        livingRoom.setCommandList(Arrays.asList(livingRoomMoveCurtainsCommand,livingRoomSwitchLightsCommand));

        KitchenRoom kitchenRoom = new KitchenRoom();
        Command kitchenRoomSwitchLightsCommand = new LightsSwitchCommand(kitchenRoom.getLight());
        kitchenRoom.setCommandList(Arrays.asList(kitchenRoomSwitchLightsCommand));

        livingRoom.executeCommand();
        System.out.println("------------------------");
        kitchenRoom.executeCommand();

        livingRoom.executeCommand();
    }
}
