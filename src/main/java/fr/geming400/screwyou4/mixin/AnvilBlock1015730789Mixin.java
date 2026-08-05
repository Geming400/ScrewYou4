package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.AnvilBlock.class)
public class AnvilBlock1015730789Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1543382783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1543382783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damage(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void damage_678180860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678180860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__242868978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-242868978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBrokenAfterFall(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/item/FallingBlockEntity;)V", cancellable = true)
    private void onBrokenAfterFall__648577566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-648577566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFallDamageSource(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getFallDamageSource_1012151684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012151684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDustColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getDustColor__1378287181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378287181L))
            info.setReturnValue(-1746584239);
    }

    @Inject(at = @At("HEAD"), method = "onLand(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/item/FallingBlockEntity;)V", cancellable = true)
    private void onLand_232476928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(232476928L))
            info.cancel();
    }


}
