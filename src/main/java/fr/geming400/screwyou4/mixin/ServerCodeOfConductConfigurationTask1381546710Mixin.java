package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.config.ServerCodeOfConductConfigurationTask.class)
public class ServerCodeOfConductConfigurationTask1381546710Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/network/ConfigurationTask$Type;", cancellable = true)
    private void type_434385822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434385822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Ljava/util/function/Consumer;)V", cancellable = true)
    private void start_2062563123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2062563123L))
            info.cancel();
    }


}
