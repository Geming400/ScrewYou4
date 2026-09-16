package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ConcretePowderBlock.class)
public class ConcretePowderBlock_1223767167Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2004754876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004754876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1245421314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245421314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onLand(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/item/FallingBlockEntity;)V", cancellable = true)
    private void onLand_2112496751(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112496751L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDustColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getDustColor__628835887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628835887L))
            info.setReturnValue(1067567171);
    }


}
