package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PumpkinBlock.class)
public class PumpkinBlock1535756809Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1692765233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692765233L))
            info.setReturnValue(null);
    }


}
