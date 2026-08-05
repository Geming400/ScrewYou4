package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BredAnimalsTrigger.TriggerInstance.class)
public class TriggerInstance997732087Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Ljava/util/Optional;", cancellable = true)
    private void parent_1243193509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243193509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1911722950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1911722950L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__137727888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137727888L))
            info.setReturnValue("{BX$B;Bn_%o^B$a!>Kc\uCCA4\u1A12[8Q\uCD10S:\uCD92.\u17D7jYvp\uA21Dx\u8B3F\u3F58G(put\u75E7:xIrK\uBE3CzGtK=81;S}\u0F46\u9266umj\u1469dM\u0CCDxKmq\"\"c\u9953r]tZ\uC28Ar*'H/\u6C11tct<y\u3A6E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1035994829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035994829L))
            info.setReturnValue(432042551);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_979207883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979207883L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1142208641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1142208641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "child()Ljava/util/Optional;", cancellable = true)
    private void child_1243193509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243193509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1243193509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243193509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bredAnimals(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void bredAnimals__705252349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705252349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bredAnimals(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void bredAnimals__59035477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59035477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bredAnimals()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void bredAnimals__2023483810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023483810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "partner()Ljava/util/Optional;", cancellable = true)
    private void partner_1243193509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243193509L))
            info.setReturnValue(null);
    }


}
