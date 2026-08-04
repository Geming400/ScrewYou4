package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ShotCrossbowTrigger.class)
public class ShotCrossbowTrigger_534314042Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger__777694879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-777694879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_142348415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142348415L))
            info.setReturnValue(null);
    }


}
