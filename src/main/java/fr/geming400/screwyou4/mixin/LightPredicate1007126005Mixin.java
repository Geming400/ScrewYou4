package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.LightPredicate.class)
public class LightPredicate1007126005Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1902329032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902329032L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__128333970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128333970L))
            info.setReturnValue("잠/XS=@!Df뛟啗k ޯ;0Kao/d/wiXY(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1045388747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1045388747L))
            info.setReturnValue(337749386);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void matches__380117681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380117681L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "composite()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void composite_855890947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855890947L))
            info.setReturnValue(null);
    }


}
