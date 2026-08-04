package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.ContextAwarePredicate.class)
public class ContextAwarePredicate1975198842Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__401750256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401750256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__743137763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-743137763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create([Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;)Lnet/minecraft/advancements/predicates/ContextAwarePredicate;", cancellable = true)
    private static void create__1292392671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292392671L))
            info.setReturnValue(null);
    }


}
