package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.TimeUtil.class)
public class TimeUtil_1795269195Mixin {
        @Inject(at = @At("HEAD"), method = "rangeOfSeconds(II)Lnet/minecraft/util/valueproviders/UniformInt;", cancellable = true)
    private static void rangeOfSeconds__975044080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975044080L))
            info.setReturnValue(null);
    }


}
