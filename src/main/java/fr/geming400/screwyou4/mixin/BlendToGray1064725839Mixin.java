package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.ColorModifier.BlendToGray.class)
public class BlendToGray1064725839Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1844729198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844729198L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__70734136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70734136L))
            info.setReturnValue("S/}9궖PLFMB]t尮ฏߥ,3 튷n38E畐__wMf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1102988581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102988581L))
            info.setReturnValue(-195904674);
    }

    @Inject(at = @At("HEAD"), method = "factor()F", cancellable = true)
    private void factor_1102985202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102985202L))
            info.setReturnValue(7.147807E8F);
    }

    @Inject(at = @At("HEAD"), method = "brightness()F", cancellable = true)
    private void brightness_1102985202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102985202L))
            info.setReturnValue(7.147807E8F);
    }


}
