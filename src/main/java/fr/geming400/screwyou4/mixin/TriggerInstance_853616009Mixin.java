package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FallAfterExplosionTrigger.TriggerInstance.class)
public class TriggerInstance_853616009Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2055839029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055839029L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__281843967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281843967L))
            info.setReturnValue("oCgFL&J*l3?hcijMi_<C&\uFEF4_>Q6sHOza0O\u0688\u1F9B\u7732");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_891878750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891878750L))
            info.setReturnValue(1358431535);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_1160866351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160866351L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "cause()Ljava/util/Optional;", cancellable = true)
    private void cause_1099077430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099077430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1286324720(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1286324720L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "distance()Ljava/util/Optional;", cancellable = true)
    private void distance_1099077430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099077430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startPosition()Ljava/util/Optional;", cancellable = true)
    private void startPosition_1099077430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099077430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1099077430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099077430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallAfterExplosion(Lnet/minecraft/advancements/predicates/DistancePredicate;Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void fallAfterExplosion_1924674452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1924674452L))
            info.setReturnValue(null);
    }


}
