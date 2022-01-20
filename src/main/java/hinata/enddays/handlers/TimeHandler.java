package hinata.enddays.handlers;

import net.minecraft.world.World;

public class TimeHandler {
    public static long getDay(World world){
        long time = world.getWorldTime();
        if(time < 18000){
            return 1;
        }else{
            return (long)Math.floor((world.getWorldTime() - 18000) / 24000) + 2;
        }
    }
}
