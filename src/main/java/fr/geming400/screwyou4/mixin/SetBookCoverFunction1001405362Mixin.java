package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetBookCoverFunction.class)
public class SetBookCoverFunction1001405362Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1557708210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557708210L))
            info.setReturnValue(null);
    }


}
