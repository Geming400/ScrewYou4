package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CarpetBlock.class)
public class CarpetBlock2092109492Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__467004080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467004080L))
            info.setReturnValue(null);
    }


}
