package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SummonedEntityTrigger.TriggerInstance.class)
public class TriggerInstance_475203576Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1860715834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1860715834L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__660256400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-660256400L))
            info.setReturnValue("\u9D5EYb\u8757@Hly<D\uFA79[;-77sc*jE0R");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_513466317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513466317L))
            info.setReturnValue(1974450924);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1901745523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1901745523L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1664737153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1664737153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_720664997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720664997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_720664997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720664997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summonedEntity(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void summonedEntity__1227780861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1227780861L))
            info.setReturnValue(null);
    }


}
