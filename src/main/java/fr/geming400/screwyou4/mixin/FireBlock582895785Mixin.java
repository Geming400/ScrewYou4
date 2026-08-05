package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FireBlock.class)
public class FireBlock582895785Mixin {
        @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap_1138242246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1138242246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1649341039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649341039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1886292695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886292695L))
            info.setReturnValue(null);
    }


}
