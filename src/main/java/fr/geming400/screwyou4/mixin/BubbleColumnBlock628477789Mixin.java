package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BubbleColumnBlock.class)
public class BubbleColumnBlock628477789Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1694923043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694923043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Ljava/util/Optional;", cancellable = true)
    private void getPickupSound__531604280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-531604280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pickupBlock(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void pickupBlock__338202235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338202235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateColumn(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void updateColumn__1327847062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1327847062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateColumn(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void updateColumn__1601009639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1601009639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1033159322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1033159322L))
            info.cancel();
    }


}
