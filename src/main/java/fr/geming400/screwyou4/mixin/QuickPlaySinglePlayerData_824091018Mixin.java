package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlaySinglePlayerData.class)
public class QuickPlaySinglePlayerData_824091018Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__84535251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84535251L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1594514542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594514542L))
            info.setReturnValue("PTT1F(tR}\u6E7D%`Q\uD638Yd\u4790_xtW1sp<5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1381443108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1381443108L))
            info.setReturnValue(1759241950);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__1210056983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210056983L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "worldId()Ljava/lang/String;", cancellable = true)
    private void worldId_1420722591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420722591L))
            info.setReturnValue("go\u40B2\u02AC/yIe7>^>'\u803F9t Ndn");
    }


}
