package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CampfireBlock.class)
public class CampfireBlock_1796040696Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__763072877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763072877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_210563040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210563040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid_1205824119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205824119L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isLitCampfire(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isLitCampfire_1650751957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650751957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "makeParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;ZZ)V", cancellable = true)
    private static void makeParticles__360043033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-360043033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSmokeyPos(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isSmokeyPos__1671317269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1671317269L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__157426648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157426648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_537440928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537440928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1673438614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1673438614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canLight(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canLight_1650751957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650751957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "dowse(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void dowse_541441942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(541441942L))
            info.cancel();
    }


}
