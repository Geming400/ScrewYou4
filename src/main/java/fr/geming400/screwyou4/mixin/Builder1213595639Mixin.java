package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.EnchantWithLevelsFunction.Builder.class)
public class Builder1213595639Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build_500035485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500035485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptions(Ljava/util/Optional;)Lnet/minecraft/world/level/storage/loot/functions/EnchantWithLevelsFunction$Builder;", cancellable = true)
    private void withOptions_1344552452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344552452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOptions(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/level/storage/loot/functions/EnchantWithLevelsFunction$Builder;", cancellable = true)
    private void withOptions_1906762398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906762398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "includeAdditionalCostComponent()Lnet/minecraft/world/level/storage/loot/functions/EnchantWithLevelsFunction$Builder;", cancellable = true)
    private void includeAdditionalCostComponent__620280429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620280429L))
            info.setReturnValue(null);
    }


}
