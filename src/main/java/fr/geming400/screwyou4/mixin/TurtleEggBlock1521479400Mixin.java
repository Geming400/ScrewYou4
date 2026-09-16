package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TurtleEggBlock.class)
public class TurtleEggBlock1521479400Mixin {
        @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__526754158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-526754158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_1325830027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1325830027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1707042642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707042642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy_1847122989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847122989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__947709080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947709080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSand(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isSand_978511426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978511426L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onSand(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void onSand__398353491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398353491L))
            info.setReturnValue(false);
    }


}
