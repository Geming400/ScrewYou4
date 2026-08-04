package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MangroveRootsBlock.class)
public class MangroveRootsBlock_950608167Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1608505406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608505406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__307991601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307991601L))
            info.setReturnValue(null);
    }


}
