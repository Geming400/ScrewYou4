package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SkullBlock.class)
public class SkullBlock_790743372Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1768370201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768370201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__467856396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467856396L))
            info.setReturnValue(null);
    }


}
