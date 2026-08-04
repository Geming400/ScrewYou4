package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ConsumeItemTrigger.class)
public class ConsumeItemTrigger1481383983Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger_169375063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169375063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1089418357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089418357L))
            info.setReturnValue(null);
    }


}
