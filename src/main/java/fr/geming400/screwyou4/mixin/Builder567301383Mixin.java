package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetEnchantmentsFunction.Builder.class)
public class Builder567301383Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__146258771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-146258771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEnchantment(Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/SetEnchantmentsFunction$Builder;", cancellable = true)
    private void withEnchantment__508031183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508031183L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetEnchantmentsFunction$Builder());
    }


}
