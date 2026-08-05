package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.PriorityProvider.Selector.class)
public class Selector_84413192Mixin {
        @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_122675437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122675437L))
            info.setReturnValue(-1745882568);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1469925450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469925450L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1051046784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051046784L))
            info.setReturnValue("Zw嶦r(W!rr,M|6<]kAﰓW4k>-W{d+Wv*(AqLU$N-R};t㼑M $弑WrmmTၱXNX]yg$쁩");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_122675933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122675933L))
            info.setReturnValue(-1924406057);
    }

    @Inject(at = @At("HEAD"), method = "condition()Ljava/util/Optional;", cancellable = true)
    private void condition_329874613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(329874613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_568091166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568091166L))
            info.setReturnValue(null);
    }


}
