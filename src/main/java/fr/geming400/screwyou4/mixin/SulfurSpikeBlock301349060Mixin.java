package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SulfurSpikeBlock.class)
public class SulfurSpikeBlock301349060Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2037202784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037202784L))
            info.setReturnValue(null);
    }


}
