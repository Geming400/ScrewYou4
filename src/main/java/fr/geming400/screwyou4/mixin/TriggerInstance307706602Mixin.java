package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TameAnimalTrigger.TriggerInstance.class)
public class TriggerInstance307706602Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__600919666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600919666L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1078130127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078130127L))
            info.setReturnValue("\uC2BAeiV'\u2473Yf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_865058693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865058693L))
            info.setReturnValue(1292340335);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_1021775789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021775789L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_567879708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(567879708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__922946439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922946439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_397531003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(397531003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tamedAnimal()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tamedAnimal_1626085206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626085206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tamedAnimal(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tamedAnimal_333804859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333804859L))
            info.setReturnValue(null);
    }


}
