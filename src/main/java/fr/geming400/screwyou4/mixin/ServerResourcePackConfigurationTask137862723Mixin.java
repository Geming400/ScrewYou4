package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.config.ServerResourcePackConfigurationTask.class)
public class ServerResourcePackConfigurationTask137862723Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/network/ConfigurationTask$Type;", cancellable = true)
    private void type_233743633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233743633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Ljava/util/function/Consumer;)V", cancellable = true)
    private void start_1721910914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1721910914L))
            info.cancel();
    }


}
