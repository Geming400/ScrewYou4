package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsedTotemTrigger.class)
public class UsedTotemTrigger_1638600326Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger_326591405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(326591405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1246634699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246634699L))
            info.setReturnValue(null);
    }


}
