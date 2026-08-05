package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SpearMobsTrigger.class)
public class SpearMobsTrigger_1261802606Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;I)V", cancellable = true)
    private void trigger_991167633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(991167633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__542906935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542906935L))
            info.setReturnValue(null);
    }


}
