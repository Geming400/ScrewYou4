package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MudBlock.class)
public class MudBlock866228149Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1692885423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692885423L))
            info.setReturnValue(null);
    }


}
