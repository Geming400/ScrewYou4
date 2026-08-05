package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.AmethystBlock.class)
public class AmethystBlock992354290Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2058799544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058799544L))
            info.setReturnValue(null);
    }


}
