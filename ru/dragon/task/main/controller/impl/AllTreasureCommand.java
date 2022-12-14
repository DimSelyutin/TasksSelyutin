package ru.dragon.task.main.controller.impl;

import java.util.List;

import ru.dragon.task.main.bean.Treasure;
import ru.dragon.task.main.command.Command;
import ru.dragon.task.main.command.CommandName;
import ru.dragon.task.main.controller.UserRequest;
import ru.dragon.task.main.controller.UserResponce;
import ru.dragon.task.main.dto.CartOfTreasure;
import ru.dragon.task.main.logic.CaveLogic;


public class AllTreasureCommand implements Command {
    private final CaveLogic cv = CaveLogic.getInstance();

    @Override
    public UserResponce execute(UserRequest request) {
        String cmd = request.getCommandName();
        UserResponce responce = new UserResponce();

        CartOfTreasure cot = new CartOfTreasure();      //
        CommandName cmdName = CommandName.valueOf(cmd);

        List<Treasure> treasure = cv.allTreasure(cot.getCAVE());
        responce.setComandName(cmdName.ALL.toString());
        responce.setListTreasure((List<Treasure>) treasure);
        
        return responce;
    }

    


   

   

    
}