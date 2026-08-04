package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.SplashManager.class)
public class SplashManager_1871180136Mixin {
        @Inject(at = @At("HEAD"), method = "getSplash()Lnet/minecraft/client/gui/components/SplashRenderer;", cancellable = true)
    private void getSplash_972946742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972946742L))
            info.setReturnValue(null);
    }


}
