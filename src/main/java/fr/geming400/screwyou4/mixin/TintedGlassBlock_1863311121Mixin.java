package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TintedGlassBlock.class)
public class TintedGlassBlock_1863311121Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__695802452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695802452L))
            info.setReturnValue(null);
    }


}
