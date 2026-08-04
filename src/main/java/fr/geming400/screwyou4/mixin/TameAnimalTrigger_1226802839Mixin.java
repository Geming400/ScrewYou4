package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TameAnimalTrigger.class)
public class TameAnimalTrigger_1226802839Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/animal/Animal;)V", cancellable = true)
    private void trigger__1896947596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1896947596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_834837212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834837212L))
            info.setReturnValue(null);
    }


}
