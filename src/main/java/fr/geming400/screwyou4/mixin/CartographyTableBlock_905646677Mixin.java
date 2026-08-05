package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CartographyTableBlock.class)
public class CartographyTableBlock_905646677Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1972091930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972091930L))
            info.setReturnValue(null);
    }


}
