package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.EncoderCache.class)
public class EncoderCache928234060Mixin {
        @Inject(at = @At("HEAD"), method = "wrap(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void wrap_1411911787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411911787L))
            info.setReturnValue(null);
    }


}
