package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetAttributesFunction.Builder.class)
public class Builder_2080085886Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build_1366525731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366525731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withModifier(Lnet/minecraft/world/level/storage/loot/functions/SetAttributesFunction$ModifierBuilder;)Lnet/minecraft/world/level/storage/loot/functions/SetAttributesFunction$Builder;", cancellable = true)
    private void withModifier_672546213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672546213L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetAttributesFunction$Builder());
    }


}
