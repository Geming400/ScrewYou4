package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EnchantingTableBlock.class)
public class EnchantingTableBlock_1729421972Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1499100071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1499100071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1870997356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870997356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_2134103504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2134103504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__577402684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577402684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBookShelf(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isValidBookShelf__1207377184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207377184L))
            info.setReturnValue(true);
    }


}
