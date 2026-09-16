package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.block.BlockTintSources.class)
public class BlockTintSources_364717380Mixin {
        @Inject(at = @At("HEAD"), method = "constant(II)Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void constant_235011752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235011752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constant(I)Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void constant__370197849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370197849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleTallGrass()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void doubleTallGrass_8931420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8931420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterParticles()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void waterParticles_2051910906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051910906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grass()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void grass__149987494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-149987494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stem()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void stem__1948174291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948174291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "redstone()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void redstone__1936927336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936927336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "water()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void water_912093179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912093179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foliage()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void foliage__341760867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341760867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grassBlock()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void grassBlock__529524901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-529524901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dryFoliage()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void dryFoliage__2109849934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109849934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sugarCane()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void sugarCane__42945329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42945329L))
            info.setReturnValue(null);
    }


}
