package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.AnvilBlock.class)
public class AnvilBlock1015730789Mixin {
        @Inject(at = @At("HEAD"), method = "damage(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void damage_1340829803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340829803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2082176043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082176043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBrokenAfterFall(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/item/FallingBlockEntity;)V", cancellable = true)
    private void onBrokenAfterFall_1908960063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1908960063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDustColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getDustColor__836872264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836872264L))
            info.setReturnValue(1776171263);
    }

    @Inject(at = @At("HEAD"), method = "getFallDamageSource(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getFallDamageSource__1947917761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947917761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1453457691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1453457691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onLand(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/item/FallingBlockEntity;)V", cancellable = true)
    private void onLand_1904460374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1904460374L))
            info.cancel();
    }


}
