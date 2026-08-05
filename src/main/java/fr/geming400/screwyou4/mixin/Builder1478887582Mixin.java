package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction.Builder.class)
public class Builder1478887582Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__811521514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811521514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLimit(I)Lnet/minecraft/world/level/storage/loot/functions/EnchantedCountIncreaseFunction$Builder;", cancellable = true)
    private void setLimit_455947713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455947713L))
            info.setReturnValue(null);
    }


}
