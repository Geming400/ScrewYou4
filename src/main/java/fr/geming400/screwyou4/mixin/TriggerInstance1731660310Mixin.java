package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.DistanceTrigger.TriggerInstance.class)
public class TriggerInstance1731660310Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1177794727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177794727L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_596200335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596200335L))
            info.setReturnValue("S⫊bL,}5VHY?룔PHe)0❋庅x㱐m[r[B?9I휛t␏%vy\"f/CKE&D]E,0&yῘe|鱵KzUR#߃Jhv_bjh䷭6沼RzC뷉Je3 'M(@eYh_6 ,&㋸(`+Skn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1769923052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769923052L))
            info.setReturnValue(1422436343);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_303708254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303708254L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "distance()Ljava/util/Optional;", cancellable = true)
    private void distance_1977121732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977121732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startPosition()Ljava/util/Optional;", cancellable = true)
    private void startPosition_1977121732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977121732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1977121732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977121732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallFromHeight(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/DistancePredicate;Lnet/minecraft/advancements/predicates/LocationPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void fallFromHeight__1853684373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853684373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rideEntityInLava(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/DistancePredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void rideEntityInLava__532011912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532011912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travelledThroughNether(Lnet/minecraft/advancements/predicates/DistancePredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void travelledThroughNether_43924093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43924093L))
            info.setReturnValue(null);
    }


}
