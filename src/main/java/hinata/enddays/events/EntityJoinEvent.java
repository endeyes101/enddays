package hinata.enddays.events;

import hinata.enddays.handlers.CheckDayHandler;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EntityJoinEvent {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onEntityJoinWorld(EntityJoinWorldEvent event){
        if(event.getWorld().isRemote){
            return;
        }
        Entity entity = event.getEntity();
        if(entity == null){
            return;
        }
        World world = event.getWorld();
        CheckDayHandler.checkDay(world, entity);
    }
}
