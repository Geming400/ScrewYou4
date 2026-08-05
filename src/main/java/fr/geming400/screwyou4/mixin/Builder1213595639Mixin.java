package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantWithLevelsFunction.Builder.class)
public class Builder1213595639Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__1076813457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076813457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptions(Ljava/util/Optional;)Lnet/minecraft/world/level/storage/loot/functions/EnchantWithLevelsFunction$Builder;", cancellable = true)
    private void withOptions_812387580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812387580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptions(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/EnchantWithLevelsFunction$Builder;", cancellable = true)
    private void withOptions_714234774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714234774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "includeAdditionalCostComponent()Lnet/minecraft/world/level/storage/loot/functions/EnchantWithLevelsFunction$Builder;", cancellable = true)
    private void includeAdditionalCostComponent_1120453524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120453524L))
            info.setReturnValue(null);
    }


}
