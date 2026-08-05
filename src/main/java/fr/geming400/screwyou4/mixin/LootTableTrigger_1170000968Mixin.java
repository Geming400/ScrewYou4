package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LootTableTrigger.class)
public class LootTableTrigger_1170000968Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void trigger__438250378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-438250378L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__634708573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634708573L))
            info.setReturnValue(null);
    }


}
