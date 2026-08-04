package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.EmptyBlockGetter.class)
public class EmptyBlockGetter_808322499Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/EmptyBlockGetter;", cancellable = true)
    private static void values__1082918950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082918950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/EmptyBlockGetter;", cancellable = true)
    private static void valueOf_922275543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922275543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__2040468025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2040468025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_805983290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805983290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1206948444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206948444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_846584744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846584744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_846584744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846584744L))
            info.setReturnValue(null);
    }


}
