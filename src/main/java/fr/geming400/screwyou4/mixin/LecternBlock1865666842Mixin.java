package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LecternBlock.class)
public class LecternBlock1865666842Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1362855200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362855200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_2007242227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007242227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__603521638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603521638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signalPageChange(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void signalPageChange_198400370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(198400370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetBookState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private static void resetBookState__663975447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-663975447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryPlaceBook(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void tryPlaceBook_358138023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358138023L))
            info.setReturnValue(true);
    }


}
