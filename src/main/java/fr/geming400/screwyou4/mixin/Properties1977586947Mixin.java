package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ClientItem.Properties.class)
public class Properties1977586947Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1068960679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068960679L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1546956824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546956824L))
            info.setReturnValue("\u3817\"\u3024BaScJ\u628D;p!oY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1760028258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760028258L))
            info.setReturnValue(-2031603111);
    }

    @Inject(at = @At("HEAD"), method = "handAnimationOnSwap()Z", cancellable = true)
    private void handAnimationOnSwap_1936208595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936208595L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "oversizedInGui()Z", cancellable = true)
    private void oversizedInGui_1926731827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926731827L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "swapAnimationScale()F", cancellable = true)
    private void swapAnimationScale__1378605395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378605395L))
            info.setReturnValue(1.230052E8F);
    }


}
