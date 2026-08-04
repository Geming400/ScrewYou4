package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.TimeCheck.Builder.class)
public class Builder_153207732Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void build_437601171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437601171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/TimeCheck;", cancellable = true)
    private void build_387439672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387439672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPeriod(J)Lnet/minecraft/world/level/storage/loot/predicates/TimeCheck$Builder;", cancellable = true)
    private void setPeriod__1025683205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025683205L))
            info.setReturnValue(null);
    }


}
