package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ShotCrossbowTrigger.class)
public class ShotCrossbowTrigger_534314042Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void trigger__1945507559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1945507559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1270395499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270395499L))
            info.setReturnValue(null);
    }


}
