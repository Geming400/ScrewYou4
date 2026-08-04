package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MossyCarpetBlock.class)
public class MossyCarpetBlock_348933425Mixin {
        @Inject(at = @At("HEAD"), method = "getPropertyForFace(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void getPropertyForFace_1947939458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947939458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2084787148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084787148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeAt(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;I)V", cancellable = true)
    private static void placeAt_385223584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(385223584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeShapes()Ljava/util/function/Function;", cancellable = true)
    private void makeShapes__1577239323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577239323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy_2076365572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2076365572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__909666343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909666343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_393613182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393613182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__1794033129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1794033129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1623979719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623979719L))
            info.setReturnValue(null);
    }


}
