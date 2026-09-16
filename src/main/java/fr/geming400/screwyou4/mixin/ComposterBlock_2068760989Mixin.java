package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ComposterBlock.class)
public class ComposterBlock_2068760989Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1159761054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159761054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractProduce(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void extractProduce_897875158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897875158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "insertItem(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void insertItem__1073959848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073959848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleFill(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private static void handleFill__845144585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-845144585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainer(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/WorldlyContainer;", cancellable = true)
    private void getContainer__1143737977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143737977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap__1670859847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1670859847L))
            info.cancel();
    }


}
