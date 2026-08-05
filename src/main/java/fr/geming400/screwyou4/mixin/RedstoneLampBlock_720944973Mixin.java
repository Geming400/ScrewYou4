package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RedstoneLampBlock.class)
public class RedstoneLampBlock_720944973Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1787390226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787390226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1748243508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748243508L))
            info.setReturnValue(null);
    }


}
