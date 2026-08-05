package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PitcherCropBlock.class)
public class PitcherCropBlock_2030074060Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__539409948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539409948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__529039513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-529039513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__112892494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-112892494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_57160916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57160916L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_2074753817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074753817L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSurvive(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canSurvive__889274983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889274983L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "randomTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void randomTick__21994550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-21994550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeReplaced(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/context/BlockPlaceContext;)Z", cancellable = true)
    private void canBeReplaced_1283870742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283870742L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_771474292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771474292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/ScheduledTickAccess;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void updateShape__723829820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723829820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape__539409948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539409948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityInside(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/InsideBlockEffectApplier;Z)V", cancellable = true)
    private void entityInside_1039202906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039202906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__537461089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-537461089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTicking(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isRandomlyTicking_1884785073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884785073L))
            info.setReturnValue(true);
    }


}
