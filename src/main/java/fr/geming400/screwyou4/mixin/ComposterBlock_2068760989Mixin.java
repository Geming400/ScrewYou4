package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ComposterBlock.class)
public class ComposterBlock_2068760989Mixin {
        @Inject(at = @At("HEAD"), method = "getContainer(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/WorldlyContainer;", cancellable = true)
    private void getContainer__143649156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143649156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__490352584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490352584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleFill(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private static void handleFill_1997819820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1997819820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractProduce(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void extractProduce__191011051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-191011051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap_2107035975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2107035975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "insertItem(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void insertItem_1053342956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053342956L))
            info.setReturnValue(null);
    }


}
