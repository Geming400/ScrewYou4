package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LightningStrikeTrigger.class)
public class LightningStrikeTrigger_368925726Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/LightningBolt;Ljava/util/List;)V", cancellable = true)
    private void trigger_417892828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(417892828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__23039901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23039901L))
            info.setReturnValue(null);
    }


}
