package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlagUniverse.class)
public class FeatureFlagUniverse_1193059655Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1963482683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963482683L))
            info.setReturnValue(")i(WTw30MgB:\u516Cu]crrtf\u9288M'z9\uA131%}l-\u6903`q");
    }


}
