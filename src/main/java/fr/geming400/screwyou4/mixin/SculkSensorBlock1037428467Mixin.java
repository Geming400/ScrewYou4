package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkSensorBlock.class)
public class SculkSensorBlock1037428467Mixin {
        @Inject(at = @At("HEAD"), method = "deactivate(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void deactivate__1943349026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1943349026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/properties/SculkSensorPhase;", cancellable = true)
    private static void getPhase_959955644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959955644L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SculkSensorPhase.INACTIVE);
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_841779094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(841779094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2103873721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103873721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activate(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)V", cancellable = true)
    private void activate_1409214662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1409214662L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1179003852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179003852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryResonateVibration(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void tryResonateVibration_1426170453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1426170453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canActivate(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canActivate__1000305522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1000305522L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getActiveTicks()I", cancellable = true)
    private void getActiveTicks__1691998401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691998401L))
            info.setReturnValue(-80006189);
    }

    @Inject(at = @At("HEAD"), method = "getDirectSignal(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)I", cancellable = true)
    private void getDirectSignal__1917231674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1917231674L))
            info.setReturnValue(-329200392);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1431760013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431760013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1442110000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1442110000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1269396188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1269396188L))
            info.setReturnValue(null);
    }


}
