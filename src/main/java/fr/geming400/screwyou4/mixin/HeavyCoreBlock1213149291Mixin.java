package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HeavyCoreBlock.class)
public class HeavyCoreBlock1213149291Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2015372751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2015372751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1256039189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256039189L))
            info.setReturnValue(null);
    }


}
