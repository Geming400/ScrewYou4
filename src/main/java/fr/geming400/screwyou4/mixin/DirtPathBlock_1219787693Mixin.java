package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DirtPathBlock.class)
public class DirtPathBlock_1219787693Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1339325880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339325880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__38812075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-38812075L))
            info.setReturnValue(null);
    }


}
