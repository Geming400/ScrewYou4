package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TargetBlockTrigger.TriggerInstance.class)
public class TriggerInstance_1592562173Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_683935904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683935904L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1931981599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931981599L))
            info.setReturnValue("?9!'w=\uC6B2\u141A\u59D2a1Iq8\u65ECao2>1|:(x#\uB9F1U/AV1\u6592\u783E!MJWtu 7X]&+O2:(U\uB638MpPgM9'B$\u65F7H0XgofuM\uADE1\u88A72\uC130\u1F5F|P+\u69C9\"S'#>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2145053033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145053033L))
            info.setReturnValue(1254784148);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/phys/Vec3;I)Z", cancellable = true)
    private void matches_800238252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800238252L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1852735278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1852735278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_361909131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361909131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "signalStrength()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void signalStrength_1098693025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098693025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetHit(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void targetHit__1971283467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971283467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectile()Ljava/util/Optional;", cancellable = true)
    private void projectile__1198660973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198660973L))
            info.setReturnValue(null);
    }


}
