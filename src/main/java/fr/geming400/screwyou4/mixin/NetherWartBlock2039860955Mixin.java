package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NetherWartBlock.class)
public class NetherWartBlock2039860955Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1188661087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188661087L))
            info.setReturnValue(null);
    }


}
