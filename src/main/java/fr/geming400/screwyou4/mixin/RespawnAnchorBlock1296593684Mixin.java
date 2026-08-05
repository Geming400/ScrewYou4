package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RespawnAnchorBlock.class)
public class RespawnAnchorBlock1296593684Mixin {
        @Inject(at = @At("HEAD"), method = "charge(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void charge__657346176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-657346176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSetSpawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void canSetSpawn_509570127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509570127L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1931928358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931928358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findStandUpPosition(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private static void findStandUpPosition_1616726780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616726780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1701275217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1701275217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getScaledChargeLevel(Lnet/minecraft/world/level/block/state/BlockState;I)I", cancellable = true)
    private static void getScaledChargeLevel_1209180380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209180380L))
            info.setReturnValue(1434449927);
    }


}
