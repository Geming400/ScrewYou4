package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SugarCaneBlock.class)
public class SugarCaneBlock1858870502Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1369651540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369651540L))
            info.setReturnValue(null);
    }


}
