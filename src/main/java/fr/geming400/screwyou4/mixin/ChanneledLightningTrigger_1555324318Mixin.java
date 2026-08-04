package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ChanneledLightningTrigger.class)
public class ChanneledLightningTrigger_1555324318Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Ljava/util/Collection;)V", cancellable = true)
    private void trigger__1179906991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1179906991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1163358691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163358691L))
            info.setReturnValue(null);
    }


}
