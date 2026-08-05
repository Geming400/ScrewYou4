package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ImpossibleTrigger.class)
public class ImpossibleTrigger846483573Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__958225967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958225967L))
            info.setReturnValue(null);
    }


}
