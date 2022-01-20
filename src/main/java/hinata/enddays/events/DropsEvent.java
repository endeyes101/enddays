package hinata.enddays.events;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class DropsEvent {
    @SubscribeEvent
    public static void bedrockDrop(LivingDropsEvent event) {
        if (event.getEntity().world.isRemote) {
            return;
        }
        Entity entity = event.getEntity();
        if(entity.getTags().contains("bedrockEnvoy")){
            if(entity.getEntityWorld().rand.nextDouble() < 0.8){
                EntityItem bedrockItem = new EntityItem(entity.getEntityWorld(), entity.posX, entity.posY + 1D, entity.posZ, new ItemStack(Blocks.BEDROCK));
                event.getDrops().add(bedrockItem);
            }
        }
    }
}
