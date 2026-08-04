package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.DedicatedServerSettings.class)
public class DedicatedServerSettings752668199Mixin {
        @Inject(at = @At("HEAD"), method = "update(Ljava/util/function/UnaryOperator;)Lnet/minecraft/server/dedicated/DedicatedServerSettings;", cancellable = true)
    private void update__953199067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953199067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProperties()Lnet/minecraft/server/dedicated/DedicatedServerProperties;", cancellable = true)
    private void getProperties__12822520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-12822520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceSave()V", cancellable = true)
    private void forceSave_790942938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(790942938L))
            info.cancel();
    }


}
