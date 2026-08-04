package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.block.BlockTintSources.class)
public class BlockTintSources_364717380Mixin {
        @Inject(at = @At("HEAD"), method = "constant(II)Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void constant_2047432452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047432452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constant(I)Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void constant__173185333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173185333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleTallGrass()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void doubleTallGrass_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterParticles()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void waterParticles_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dryFoliage()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void dryFoliage_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "redstone()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void redstone_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stem()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void stem_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foliage()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void foliage_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "water()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void water_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grassBlock()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void grassBlock_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sugarCane()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void sugarCane_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grass()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private static void grass_586465828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586465828L))
            info.setReturnValue(null);
    }


}
