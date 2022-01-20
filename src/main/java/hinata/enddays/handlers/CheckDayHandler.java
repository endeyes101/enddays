package hinata.enddays.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import static hinata.enddays.handlers.DayTaskHandler.*;

public class CheckDayHandler {
    public static void checkDay(World world, Entity entity){
        long day = TimeHandler.getDay(world);
        if(day < 10){
            dayTask10(entity);
        }else if(day < 20){
            dayTask20(entity);
        }else if(day < 30){
            dayTask30(entity);
        }else if(day < 40){
            dayTask40(entity);
        }else if(day < 50){
            dayTask50(entity);
        }else if(day < 60){
            dayTask60(entity);
        }else if(day < 70){
            dayTask70(entity);
        }else if(day < 80){
            dayTask80(entity);
        }else if(day < 90){
            dayTask90(entity);
        }else if(day < 100){
            dayTask100(entity);
        }else{
            dayTaskEnd(entity);
        }
    }
}
