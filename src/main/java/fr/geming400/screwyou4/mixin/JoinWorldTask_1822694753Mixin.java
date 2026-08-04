package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.config.JoinWorldTask.class)
public class JoinWorldTask_1822694753Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/server/network/ConfigurationTask$Type;", cancellable = true)
    private void type_875533864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875533864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Ljava/util/function/Consumer;)V", cancellable = true)
    private void start__1791256131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791256131L))
            info.cancel();
    }


}
