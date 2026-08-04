package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerTrigger.class)
public class PlayerTrigger_1742849879Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void trigger_973288025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973288025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1350884252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350884252L))
            info.setReturnValue(null);
    }


}
