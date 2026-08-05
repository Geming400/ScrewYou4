package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RespawnAnchorBlock.class)
public class RespawnAnchorBlock1296593684Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1262519888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1262519888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findStandUpPosition(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private static void findStandUpPosition__70713219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70713219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSetSpawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void canSetSpawn__90649754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-90649754L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1173991603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1173991603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getScaledChargeLevel(Lnet/minecraft/world/level/block/state/BlockState;I)I", cancellable = true)
    private static void getScaledChargeLevel_1114871068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114871068L))
            info.setReturnValue(306819567);
    }

    @Inject(at = @At("HEAD"), method = "charge(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void charge_988392140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(988392140L))
            info.cancel();
    }


}
