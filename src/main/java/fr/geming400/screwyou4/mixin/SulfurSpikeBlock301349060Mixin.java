package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SulfurSpikeBlock.class)
public class SulfurSpikeBlock301349060Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1367794314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367794314L))
            info.setReturnValue(null);
    }


}
