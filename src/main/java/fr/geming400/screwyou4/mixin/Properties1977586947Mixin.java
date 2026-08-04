package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ClientItem.Properties.class)
public class Properties1977586947Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__931868090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-931868090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_842126972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842126972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2015849689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015849689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swapAnimationScale()F", cancellable = true)
    private void swapAnimationScale_2015846310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015846310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handAnimationOnSwap()Z", cancellable = true)
    private void handAnimationOnSwap_2015865530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015865530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oversizedInGui()Z", cancellable = true)
    private void oversizedInGui_2015865530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015865530L))
            info.setReturnValue(null);
    }


}
