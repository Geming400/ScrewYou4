package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LanternBlock.class)
public class LanternBlock164221483Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1230666737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230666737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_1990000299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990000299L))
            info.setReturnValue(null);
    }


}
