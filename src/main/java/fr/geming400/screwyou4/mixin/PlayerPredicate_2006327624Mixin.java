package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.PlayerPredicate.class)
public class PlayerPredicate_2006327624Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1097701355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097701355L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1518216148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518216148L))
            info.setReturnValue("(f-n>#WH5\uC579_\u059CO^rNrvuA]{\u53D9Lnd");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1731287582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731287582L))
            info.setReturnValue(-1793994475);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__938330739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938330739L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "input()Ljava/util/Optional;", cancellable = true)
    private void input__1015370561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015370561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void level__908572079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908572079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookingAt()Ljava/util/Optional;", cancellable = true)
    private void lookingAt__595212949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595212949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "food()Lnet/minecraft/advancements/predicates/FoodPredicate;", cancellable = true)
    private void food_1747893183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747893183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipes()Lit/unimi/dsi/fastutil/objects/Object2BooleanMap;", cancellable = true)
    private void recipes_1539074767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539074767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameType()Lnet/minecraft/advancements/predicates/GameTypePredicate;", cancellable = true)
    private void gameType_1791156607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791156607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stats()Ljava/util/List;", cancellable = true)
    private void stats_621235862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621235862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advancements()Ljava/util/Map;", cancellable = true)
    private void advancements_459983292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459983292L))
            info.setReturnValue(null);
    }


}
