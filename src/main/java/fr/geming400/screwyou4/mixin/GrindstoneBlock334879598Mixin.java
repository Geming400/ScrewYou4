package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.GrindstoneBlock.class)
public class GrindstoneBlock334879598Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2070733322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070733322L))
            info.setReturnValue(null);
    }


}
