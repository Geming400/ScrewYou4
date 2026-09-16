package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.FishingHookPredicate.class)
public class FishingHookPredicate_886930352Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__21695917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21695917L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1657353876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657353876L))
            info.setReturnValue("O!qVJ=7\uA696/@YbtK,rYR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1444282442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444282442L))
            info.setReturnValue(1991467587);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__2057728011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057728011L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "inOpenWater()Ljava/util/Optional;", cancellable = true)
    private void inOpenWater__2061914459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061914459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inOpenWater(Z)Lnet/minecraft/advancements/predicates/entity/FishingHookPredicate;", cancellable = true)
    private static void inOpenWater_1134392210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134392210L))
            info.setReturnValue(null);
    }


}
