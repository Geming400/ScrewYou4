package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.UnobstructedPredicate.class)
public class UnobstructedPredicate_875588167Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type_1340899711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340899711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__33038102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33038102L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1646011691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646011691L))
            info.setReturnValue("Nq_M|l`\u8D71oio\u971D(,hUIN7?5)NXm\uBCF0n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1432940257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432940257L))
            info.setReturnValue(1289512129);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test__2144887901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144887901L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__417331662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417331662L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__1776134375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776134375L))
            info.setReturnValue(null);
    }


}
