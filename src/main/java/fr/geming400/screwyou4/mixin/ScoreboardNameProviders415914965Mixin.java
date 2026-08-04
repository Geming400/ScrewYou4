package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.score.ScoreboardNameProviders.class)
public class ScoreboardNameProviders415914965Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap_1010504135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1010504135L))
            info.setReturnValue(null);
    }


}
