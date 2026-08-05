package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.KeyframeTrack.Builder.class)
public class Builder_1187304658Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/KeyframeTrack;", cancellable = true)
    private void build_439886345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439886345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEasing(Lnet/minecraft/util/EasingType;)Lnet/minecraft/util/KeyframeTrack$Builder;", cancellable = true)
    private void setEasing__1436859522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436859522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addKeyframe(ILjava/lang/Object;)Lnet/minecraft/util/KeyframeTrack$Builder;", cancellable = true)
    private void addKeyframe_1458200672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458200672L))
            info.setReturnValue(new net.minecraft.util.KeyframeTrack.Builder());
    }


}
