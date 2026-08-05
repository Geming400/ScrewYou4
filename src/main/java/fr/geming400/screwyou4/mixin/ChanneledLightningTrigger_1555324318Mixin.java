package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ChanneledLightningTrigger.class)
public class ChanneledLightningTrigger_1555324318Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Ljava/util/Collection;)V", cancellable = true)
    private void trigger_1212417545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1212417545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__249385223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249385223L))
            info.setReturnValue(null);
    }


}
