package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WebBlock.class)
public class WebBlock_1435059939Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1793462104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1793462104L))
            info.setReturnValue(null);
    }


}
