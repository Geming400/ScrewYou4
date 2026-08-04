package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyComponentsFunction.Builder.class)
public class Builder980090352Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build_266530198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266530198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "include(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/world/level/storage/loot/functions/CopyComponentsFunction$Builder;", cancellable = true)
    private void include__24670945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-24670945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exclude(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/world/level/storage/loot/functions/CopyComponentsFunction$Builder;", cancellable = true)
    private void exclude__24670945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-24670945L))
            info.setReturnValue(null);
    }


}
