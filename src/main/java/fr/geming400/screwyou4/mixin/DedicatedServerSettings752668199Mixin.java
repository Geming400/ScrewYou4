package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.DedicatedServerSettings.class)
public class DedicatedServerSettings752668199Mixin {
        @Inject(at = @At("HEAD"), method = "update(Ljava/util/function/UnaryOperator;)Lnet/minecraft/server/dedicated/DedicatedServerSettings;", cancellable = true)
    private void update_308674862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308674862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProperties()Lnet/minecraft/server/dedicated/DedicatedServerProperties;", cancellable = true)
    private void getProperties_1651247985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651247985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSave()V", cancellable = true)
    private void forceSave_2010392274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2010392274L))
            info.cancel();
    }


}
