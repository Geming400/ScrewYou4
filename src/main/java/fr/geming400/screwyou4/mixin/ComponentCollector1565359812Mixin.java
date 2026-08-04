package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ComponentCollector.class)
public class ComponentCollector1565359812Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1603634551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1603634551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "append(Lnet/minecraft/network/chat/FormattedText;)V", cancellable = true)
    private void append_1520363519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1520363519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResult()Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void getResult_271438155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271438155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResultOrEmpty()Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void getResultOrEmpty_271438155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271438155L))
            info.setReturnValue(null);
    }


}
