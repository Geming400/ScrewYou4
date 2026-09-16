package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.LightPredicate.class)
public class LightPredicate1007126005Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_98499737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98499737L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1777549530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777549530L))
            info.setReturnValue("lgy5\u6487\uB8FB?4|D3\u91AEv3NyzDmD\"+FYU3\uADF8\u0872=\u6472EJ?Jv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1564478096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1564478096L))
            info.setReturnValue(740082988);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void matches_512338626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512338626L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "composite()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void composite_984909532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984909532L))
            info.setReturnValue(null);
    }


}
