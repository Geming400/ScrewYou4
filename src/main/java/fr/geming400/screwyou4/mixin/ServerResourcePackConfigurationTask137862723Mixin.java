package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.config.ServerResourcePackConfigurationTask.class)
public class ServerResourcePackConfigurationTask137862723Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/network/ConfigurationTask$Type;", cancellable = true)
    private void type__809298165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809298165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Ljava/util/function/Consumer;)V", cancellable = true)
    private void start_818879136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(818879136L))
            info.cancel();
    }


}
