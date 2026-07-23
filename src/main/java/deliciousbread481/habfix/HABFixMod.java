package deliciousbread481.habfix;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(HABFixMod.MOD_ID)
public class HABFixMod {
    public static final String MOD_ID = "habfix";
    private static final Logger LOGGER = LogUtils.getLogger();

    public HABFixMod() {
        LOGGER.info("[HABFix] Hot-air Balloon dedicated-server fix loaded.");
    }
}