package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EntityHurtPlayerTrigger.TriggerInstance.class)
public class TriggerInstance_1031138888Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_122512619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122512619L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1801562412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801562412L))
            info.setReturnValue("_31`(9Hw95\u50888\uC8E8C*\u8ABBZ{W%%*Hf+*L9z\uB7D9$%oE?I\u603A:|mIyR3H,\u2555Pt>5`\u6873p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1588490978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588490978L))
            info.setReturnValue(-24837903);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/damagesource/DamageSource;FFZ)Z", cancellable = true)
    private void matches__287334830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287334830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "damage()Ljava/util/Optional;", cancellable = true)
    private void damage_1560694372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560694372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityHurtPlayer(Lnet/minecraft/advancements/predicates/DamagePredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityHurtPlayer__950139077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950139077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityHurtPlayer(Lnet/minecraft/advancements/predicates/DamagePredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityHurtPlayer__1280164604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280164604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityHurtPlayer()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void entityHurtPlayer_1026440891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026440891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__199514154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199514154L))
            info.setReturnValue(null);
    }


}
