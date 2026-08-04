package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetFireworksFunction.class)
public class SetFireworksFunction_921376016Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1637737557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637737557L))
            info.setReturnValue(null);
    }


}
