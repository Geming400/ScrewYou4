package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PitcherCropBlock.class)
public class PitcherCropBlock_2030074060Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape_1076715215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076715215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSurvive(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canSurvive__756759721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-756759721L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape_273080169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273080169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityInside(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/InsideBlockEffectApplier;Z)V", cancellable = true)
    private void entityInside_432734681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(432734681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1198447983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198447983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplaced(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/context/BlockPlaceContext;)Z", cancellable = true)
    private void canBeReplaced__1976026445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976026445L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "randomTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void randomTick_2140238538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2140238538L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1664640442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664640442L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_1173289898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1173289898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1993116239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1993116239L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__760898283(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-760898283L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTicking(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isRandomlyTicking_386203238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386203238L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__439114421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439114421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/ScheduledTickAccess;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void updateShape_1789362796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789362796L))
            info.setReturnValue(null);
    }


}
