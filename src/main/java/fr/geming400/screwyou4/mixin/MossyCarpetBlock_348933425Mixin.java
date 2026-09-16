package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MossyCarpetBlock.class)
public class MossyCarpetBlock_348933425Mixin {
        @Inject(at = @At("HEAD"), method = "placeAt(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;I)V", cancellable = true)
    private static void placeAt__813551034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-813551034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1415378678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415378678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeShapes()Ljava/util/function/Function;", cancellable = true)
    private void makeShapes_1037885541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037885541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_949186219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949186219L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__507850737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-507850737L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_311975604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311975604L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy_1852928378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1852928378L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__2120255056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120255056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPropertyForFace(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void getPropertyForFace__2023044889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023044889L))
            info.setReturnValue(null);
    }


}
