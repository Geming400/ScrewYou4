package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlagUniverse.class)
public class FeatureFlagUniverse_1193059655Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_57599183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57599183L))
            info.setReturnValue("'\u49FBGS\uCEA6a+]AbtX#7nrh<\u942B\uBB04-<?=08X&#2\uFF2D},EV\uBB5D0AG\u832DmQ=}&,[@@3 9hWhO$[t1Hd\u3D3F'd\u6401");
    }


}
