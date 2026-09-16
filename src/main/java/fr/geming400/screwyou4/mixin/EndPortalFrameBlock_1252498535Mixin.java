package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EndPortalFrameBlock.class)
public class EndPortalFrameBlock_1252498535Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1976023508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976023508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreatePortalShape()Lnet/minecraft/world/level/block/state/pattern/BlockPattern;", cancellable = true)
    private static void getOrCreatePortalShape__373879794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373879794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1216689946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1216689946L))
            info.setReturnValue(null);
    }


}
