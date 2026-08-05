package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ChangeDimensionTrigger.class)
public class ChangeDimensionTrigger367709352Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void trigger__1285626909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1285626909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1437000188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437000188L))
            info.setReturnValue(null);
    }


}
