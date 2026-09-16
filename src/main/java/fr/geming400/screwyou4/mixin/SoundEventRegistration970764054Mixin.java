package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SoundEventRegistration.class)
public class SoundEventRegistration970764054Mixin {
        @Inject(at = @At("HEAD"), method = "isReplace()Z", cancellable = true)
    private void isReplace_617518307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617518307L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSounds()Ljava/util/List;", cancellable = true)
    private void getSounds_1652930688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1652930688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSubtitle()Ljava/lang/String;", cancellable = true)
    private void getSubtitle_1291762093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291762093L))
            info.setReturnValue("+XGh\u79A8zX\uC1B1M\u113F*AO\"/y\u78A9}\uCAF1Pa'h\uAC4B?SoC2%#\"s%\u276B;VKi\u4413zi]A\uAF7E1\u8C45SrYG");
    }


}
