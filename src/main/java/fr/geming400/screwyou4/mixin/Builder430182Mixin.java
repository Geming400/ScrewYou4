package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyBlockState.Builder.class)
public class Builder430182Mixin {
        @Inject(at = @At("HEAD"), method = "copy(Lnet/minecraft/world/level/block/state/properties/Property;)Lnet/minecraft/world/level/storage/loot/functions/CopyBlockState$Builder;", cancellable = true)
    private void copy_1357512753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1357512753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__713129972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713129972L))
            info.setReturnValue(null);
    }


}
