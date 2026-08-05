package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetStewEffectFunction.Builder.class)
public class Builder68501551Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build_2073059751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073059751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/SetStewEffectFunction$Builder;", cancellable = true)
    private void withEffect_212319322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212319322L))
            info.setReturnValue(null);
    }


}
