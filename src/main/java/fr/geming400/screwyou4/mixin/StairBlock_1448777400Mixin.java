package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StairBlock.class)
public class StairBlock_1448777400Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1110336173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110336173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_190177632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190177632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExplosionResistance()F", cancellable = true)
    private void getExplosionResistance_1487036762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487036762L))
            info.setReturnValue(4.368646E8F);
    }

    @Inject(at = @At("HEAD"), method = "isStairs(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isStairs_1303488661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303488661L))
            info.setReturnValue(false);
    }


}
