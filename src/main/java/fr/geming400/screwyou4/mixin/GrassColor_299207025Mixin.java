package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.GrassColor.class)
public class GrassColor_299207025Mixin {
        @Inject(at = @At("HEAD"), method = "get(DD)I", cancellable = true)
    private static void get__1472240968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472240968L))
            info.setReturnValue(-1275293426);
    }

    @Inject(at = @At("HEAD"), method = "init([I)V", cancellable = true)
    private static void init__525949863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-525949863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultColor()I", cancellable = true)
    private static void getDefaultColor__1050447050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050447050L))
            info.setReturnValue(1539428226);
    }


}
