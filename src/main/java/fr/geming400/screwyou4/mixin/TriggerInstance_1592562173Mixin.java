package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TargetBlockTrigger.TriggerInstance.class)
public class TriggerInstance_1592562173Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1316892865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1316892865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_457102197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457102197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1630824914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630824914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/phys/Vec3;I)Z", cancellable = true)
    private void matches_1775332479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775332479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__547378556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-547378556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1838023594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838023594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectile()Ljava/util/Optional;", cancellable = true)
    private void projectile_1838023594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838023594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetHit(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void targetHit_656655795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656655795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signalStrength()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void signalStrength_1441327114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441327114L))
            info.setReturnValue(null);
    }


}
