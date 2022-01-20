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
public class FlyMobEvent {

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
        if(day < 80){
            return;
        }
        BlockPos entityPos = entity.getPosition();
        EntityPlayer player = world.getNearestAttackablePlayer(entityPos, 64D, 64D);
        if(player != null && entity.getTags().contains("canFly")){
//            logger.info("这里获取到了玩家");
            double x = player.posX - entity.posX;
            double y = player.posY - entity.posY;
            double z = player.posZ - entity.posZ;
            entity.moveRelative((float)x, (float)y ,(float)z, 0.1f);
        }
    }
}
