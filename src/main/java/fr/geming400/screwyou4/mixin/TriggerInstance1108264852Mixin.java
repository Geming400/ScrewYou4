package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerInteractTrigger.TriggerInstance.class)
public class TriggerInstance1108264852Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_199638584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199638584L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1878688377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878688377L))
            info.setReturnValue("Y\u5C31o_(RT{.4y\"_>w^\"$,bH(Xp-\u189Dj2\uC605c\u3E61d[+>FNC36KtK%tDK[/Ko\u2870\u1D77\u464E;;\u4B7C|Zd]sP");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1665616943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665616943L))
            info.setReturnValue(1035588574);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1994439812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994439812L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1368437958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1368437958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_309750613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309750613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_1198089253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198089253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipmentSheared(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void equipmentSheared_122702484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122702484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipmentSheared(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void equipmentSheared__894102365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894102365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemUsedOnEntity(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void itemUsedOnEntity_1362773748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362773748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemUsedOnEntity(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void itemUsedOnEntity__2072968957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072968957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__122388189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-122388189L))
            info.setReturnValue(null);
    }


}
