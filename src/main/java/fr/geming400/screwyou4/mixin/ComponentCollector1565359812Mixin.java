package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ComponentCollector.class)
public class ComponentCollector1565359812Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__164077176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-164077176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "append(Lnet/minecraft/network/chat/FormattedText;)V", cancellable = true)
    private void append_833792421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(833792421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResult()Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void getResult_1203786526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203786526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResultOrEmpty()Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void getResultOrEmpty_1117601698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117601698L))
            info.setReturnValue(null);
    }


}
