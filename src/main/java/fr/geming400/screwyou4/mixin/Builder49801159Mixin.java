package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.PlayerPredicate.Builder.class)
public class Builder49801159Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/entity/PlayerPredicate;", cancellable = true)
    private void build_601103118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601103118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void setLevel__1729699994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729699994L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.PlayerPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setGameType(Lnet/minecraft/advancements/predicates/GameTypePredicate;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void setGameType_395951524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395951524L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.PlayerPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "addRecipe(Lnet/minecraft/resources/ResourceKey;Z)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void addRecipe__809578190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809578190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFood(Lnet/minecraft/advancements/predicates/FoodPredicate;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void setFood__2096815488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096815488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasInput(Lnet/minecraft/advancements/predicates/InputPredicate;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void hasInput__343692286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343692286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addStat(Lnet/minecraft/stats/StatType;Lnet/minecraft/core/Holder$Reference;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void addStat_1532479272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532479272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAdvancementCriterions(Lnet/minecraft/resources/Identifier;Ljava/util/Map;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void checkAdvancementCriterions__1265463412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265463412L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.PlayerPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setLookingAt(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void setLookingAt__351206184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351206184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAdvancementDone(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void checkAdvancementDone__256598771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256598771L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.PlayerPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private static void player__951640958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951640958L))
            info.setReturnValue(new net.minecraft.advancements.predicates.entity.PlayerPredicate.Builder());
    }


}
