package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.CubeMobPredicate.class)
public class CubeMobPredicate1644926674Mixin {
        @Inject(at = @At("HEAD"), method = "size()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void size_1493691616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493691616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1264528363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1264528363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_509466699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509466699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1683189416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683189416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__309265237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309265237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sized(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/entity/CubeMobPredicate;", cancellable = true)
    private static void sized_352776066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352776066L))
            info.setReturnValue(null);
    }


}
