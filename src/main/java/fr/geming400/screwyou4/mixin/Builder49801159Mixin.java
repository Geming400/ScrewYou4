package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.PlayerPredicate.Builder.class)
public class Builder49801159Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/entity/PlayerPredicate;", cancellable = true)
    private void build_1579067424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579067424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void setLevel__542532888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542532888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLookingAt(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void setLookingAt__2071247196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071247196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setGameType(Lnet/minecraft/advancements/predicates/GameTypePredicate;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void setGameType__1356374734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356374734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAdvancementDone(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void checkAdvancementDone__1122264409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122264409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAdvancementCriterions(Lnet/minecraft/resources/Identifier;Ljava/util/Map;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void checkAdvancementCriterions_1750434326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750434326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addStat(Lnet/minecraft/stats/StatType;Lnet/minecraft/core/Holder$Reference;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void addStat__488339373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-488339373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFood(Lnet/minecraft/advancements/predicates/FoodPredicate;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void setFood__1005036960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005036960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasInput(Lnet/minecraft/advancements/predicates/InputPredicate;)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void hasInput_603735730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603735730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private static void player__1245876511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245876511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRecipe(Lnet/minecraft/resources/ResourceKey;Z)Lnet/minecraft/advancements/predicates/entity/PlayerPredicate$Builder;", cancellable = true)
    private void addRecipe_550880675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550880675L))
            info.setReturnValue(null);
    }


}
