package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.GlazedTerracottaBlock.class)
public class GlazedTerracottaBlock_371683Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1736225406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736225406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1258228085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258228085L))
            info.setReturnValue(null);
    }


}
