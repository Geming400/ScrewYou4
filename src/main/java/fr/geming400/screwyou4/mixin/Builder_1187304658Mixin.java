package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.KeyframeTrack.Builder.class)
public class Builder_1187304658Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/KeyframeTrack;", cancellable = true)
    private void build_53911067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53911067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addKeyframe(ILjava/lang/Object;)Lnet/minecraft/util/KeyframeTrack$Builder;", cancellable = true)
    private void addKeyframe__724370257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724370257L))
            info.setReturnValue(new net.minecraft.util.KeyframeTrack.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setEasing(Lnet/minecraft/util/EasingType;)Lnet/minecraft/util/KeyframeTrack$Builder;", cancellable = true)
    private void setEasing_1524760203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524760203L))
            info.setReturnValue(new net.minecraft.util.KeyframeTrack.Builder());
    }


}
