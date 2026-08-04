package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FireBlock.class)
public class FireBlock582895785Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1976217787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976217787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap_621170772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(621170772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__675703982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675703982L))
            info.setReturnValue(null);
    }


}
