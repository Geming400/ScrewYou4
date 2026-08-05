package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugSubscription.Update.class)
public class Update_405459823Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/util/Optional;", cancellable = true)
    private void value_650921244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650921244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1790972081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790972081L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__730000153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730000153L))
            info.setReturnValue("4 :GudK}!$|&e?쟬O?`L: $qW1>:{럔#QE7+-빞蘨`v/G-멅QG]2DU<09-᧾dỷ03{<EiH㍒yOTttqtX垐{mAe$w#媦*:BH/*)!cs");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_443722564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443722564L))
            info.setReturnValue(1826656749);
    }

    @Inject(at = @At("HEAD"), method = "subscription()Lnet/minecraft/util/debug/DebugSubscription;", cancellable = true)
    private void subscription_1163402497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163402497L))
            info.setReturnValue(null);
    }


}
