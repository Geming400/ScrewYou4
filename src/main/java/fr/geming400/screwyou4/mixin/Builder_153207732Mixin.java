package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.TimeCheck.Builder.class)
public class Builder_153207732Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void build_1209223397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209223397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/TimeCheck;", cancellable = true)
    private void build__2137959542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137959542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPeriod(J)Lnet/minecraft/world/level/storage/loot/predicates/TimeCheck$Builder;", cancellable = true)
    private void setPeriod__1593266690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593266690L))
            info.setReturnValue(null);
    }


}
