package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ObserverBlock.class)
public class ObserverBlock284306569Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1350751823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350751823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_2110085385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110085385L))
            info.setReturnValue(null);
    }


}
