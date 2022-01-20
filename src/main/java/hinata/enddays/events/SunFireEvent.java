package hinata.enddays.events;

import hinata.enddays.handlers.TimeHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class SunFireEvent {
    @SubscribeEvent
    public static void entityUpdate(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntity() instanceof EntityPlayer){
            return;
        }
        Entity entity = event.getEntity();
        World world = entity.getEntityWorld();
        if(world.isRemote){
            return;
        }
        long day = TimeHandler.getDay(world);
        if(day < 10){
            return;
        }
        BlockPos pos = entity.getPosition();
        if (world.canSeeSky(pos) && world.isDaytime() && entity.isBurning() && !entity.isInLava()){
            entity.extinguish();
        }
    }
}
