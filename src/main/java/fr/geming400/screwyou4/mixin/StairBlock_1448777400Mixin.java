package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StairBlock.class)
public class StairBlock_1448777400Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1779744643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1779744643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1020411081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020411081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExplosionResistance()F", cancellable = true)
    private void getExplosionResistance__133419422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133419422L))
            info.setReturnValue(3.726215E8F);
    }

    @Inject(at = @At("HEAD"), method = "isStairs(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isStairs_1659537921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659537921L))
            info.setReturnValue(false);
    }


}
