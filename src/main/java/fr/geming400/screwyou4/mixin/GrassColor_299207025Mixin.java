package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.GrassColor.class)
public class GrassColor_299207025Mixin {
        @Inject(at = @At("HEAD"), method = "get(DD)I", cancellable = true)
    private static void get__844448050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844448050L))
            info.setReturnValue(1595902598);
    }

    @Inject(at = @At("HEAD"), method = "init([I)V", cancellable = true)
    private static void init__181347479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-181347479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultColor()I", cancellable = true)
    private static void getDefaultColor_337469518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337469518L))
            info.setReturnValue(-1847362743);
    }


}
