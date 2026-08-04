package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction.Builder.class)
public class Builder1478887582Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build_765327428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765327428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLimit(I)Lnet/minecraft/world/level/storage/loot/functions/EnchantedCountIncreaseFunction$Builder;", cancellable = true)
    private void setLimit__538522872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538522872L))
            info.setReturnValue(null);
    }


}
