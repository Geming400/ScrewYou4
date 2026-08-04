package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ConstructBeaconTrigger.class)
public class ConstructBeaconTrigger531517155Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;I)V", cancellable = true)
    private void trigger__1822663745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1822663745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_139551529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139551529L))
            info.setReturnValue(null);
    }


}
