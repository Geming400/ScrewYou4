package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.GrindstoneBlock.class)
public class GrindstoneBlock334879598Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1401324852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401324852L))
            info.setReturnValue(null);
    }


}
