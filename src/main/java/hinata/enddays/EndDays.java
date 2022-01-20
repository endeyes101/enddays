package hinata.enddays;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class EndDays
{

	@Mod.Instance
	public static EndDays instance;

	public EndDays(){
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event){
		if(event.player.world.isRemote){
			return;
		}
		EntityPlayer player = event.player;
		player.sendStatusMessage(new TextComponentString("【惊变100天】-末世生存。勇敢地活下去，100天后使者出现，击败它们，找到离开这里的方法！").setStyle((new Style()).setColor(TextFormatting.YELLOW)), false);
	}
}
