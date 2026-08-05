package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.InfestedRotatedPillarBlock.class)
public class InfestedRotatedPillarBlock845901794Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1912347048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912347048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1623286686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623286686L))
            info.setReturnValue(null);
    }


}
