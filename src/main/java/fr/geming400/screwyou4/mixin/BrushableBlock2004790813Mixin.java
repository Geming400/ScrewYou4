package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BrushableBlock.class)
public class BrushableBlock2004790813Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void tick__1347422049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1347422049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1223731229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223731229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/ScheduledTickAccess;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void updateShape_1764079550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764079550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick__1885494950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1885494950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private void onPlace_1879192639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1879192639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_2146366198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146366198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBrokenAfterFall(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/item/FallingBlockEntity;)V", cancellable = true)
    private void onBrokenAfterFall__1396947209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1396947209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrushSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBrushSound__965444812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965444812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBrushCompletedSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBrushCompletedSound_703647511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(703647511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTurnsInto()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getTurnsInto_1201872626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201872626L))
            info.setReturnValue(null);
    }


}
