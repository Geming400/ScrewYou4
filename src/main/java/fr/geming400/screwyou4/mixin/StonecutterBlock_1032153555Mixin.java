package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StonecutterBlock.class)
public class StonecutterBlock_1032153555Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2098598808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098598808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1437034926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437034926L))
            info.setReturnValue(null);
    }


}
