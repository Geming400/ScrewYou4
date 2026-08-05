package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TameAnimalTrigger.TriggerInstance.class)
public class TriggerInstance307706602Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1693218861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693218861L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__827753373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827753373L))
            info.setReturnValue("w");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_345969344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345969344L))
            info.setReturnValue(923284138);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__2069242496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2069242496L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1832234126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1832234126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_553168024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553168024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_553168024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553168024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tamedAnimal()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tamedAnimal_1581458001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581458001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tamedAnimal(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void tamedAnimal__1395277834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395277834L))
            info.setReturnValue(null);
    }


}
