package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.config.ServerCodeOfConductConfigurationTask.class)
public class ServerCodeOfConductConfigurationTask1381546710Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/network/ConfigurationTask$Type;", cancellable = true)
    private void type_1477427620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477427620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Ljava/util/function/Consumer;)V", cancellable = true)
    private void start__1329372395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1329372395L))
            info.cancel();
    }


}
