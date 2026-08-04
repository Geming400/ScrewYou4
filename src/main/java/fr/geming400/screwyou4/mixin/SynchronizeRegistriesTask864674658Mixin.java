package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.config.SynchronizeRegistriesTask.class)
public class SynchronizeRegistriesTask864674658Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/network/ConfigurationTask$Type;", cancellable = true)
    private void type__82486230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82486230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Ljava/util/function/Consumer;)V", cancellable = true)
    private void start_1545691071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1545691071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleResponse(Ljava/util/List;Ljava/util/function/Consumer;)V", cancellable = true)
    private void handleResponse_280116910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(280116910L))
            info.cancel();
    }


}
