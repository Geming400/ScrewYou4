package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BrushableBlock.class)
public class BrushableBlock2004790813Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void tick__47277796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-47277796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__554322759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554322759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_419313158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419313158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBrokenAfterFall(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/item/FallingBlockEntity;)V", cancellable = true)
    private void onBrokenAfterFall_340482458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(340482458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrushCompletedSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBrushCompletedSound__1199963585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199963585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTurnsInto()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getTurnsInto_1247525714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247525714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBrushSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBrushSound__1199963585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199963585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPlace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private void onPlace_241339863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(241339863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/ScheduledTickAccess;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void updateShape__749113066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749113066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1882188732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1882188732L))
            info.cancel();
    }


}
