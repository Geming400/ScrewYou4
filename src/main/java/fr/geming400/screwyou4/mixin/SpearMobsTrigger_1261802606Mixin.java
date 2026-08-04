package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SpearMobsTrigger.class)
public class SpearMobsTrigger_1261802606Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;I)V", cancellable = true)
    private void trigger__1092378295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1092378295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_869836979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869836979L))
            info.setReturnValue(null);
    }


}
