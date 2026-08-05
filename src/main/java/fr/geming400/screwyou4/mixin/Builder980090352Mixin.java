package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyComponentsFunction.Builder.class)
public class Builder980090352Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__1310318744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310318744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "include(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/world/level/storage/loot/functions/CopyComponentsFunction$Builder;", cancellable = true)
    private void include_1451450743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451450743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exclude(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/world/level/storage/loot/functions/CopyComponentsFunction$Builder;", cancellable = true)
    private void exclude_280815493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280815493L))
            info.setReturnValue(null);
    }


}
