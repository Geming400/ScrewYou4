package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PlayerInteractTrigger.TriggerInstance.class)
public class TriggerInstance1108264852Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1801190185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801190185L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__27195123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27195123L))
            info.setReturnValue("cm\uBD4E\uC1B3eN\u76F7?hZw.1s>}e4yxR>B\u508F\u77A8\u5367p$y@.= \uC5E0h\u6236B}\u9DF0+\uB1BD6i\u7C24{\u620C+bg!$HwBm]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1146527594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146527594L))
            info.setReturnValue(-811965139);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_798155727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798155727L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1031675876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1031675876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_1353726274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353726274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_1353726274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353726274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1353726274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353726274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemUsedOnEntity(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void itemUsedOnEntity_1528009922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528009922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemUsedOnEntity(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void itemUsedOnEntity_580174289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580174289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipmentSheared(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void equipmentSheared_1528009922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528009922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipmentSheared(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void equipmentSheared_580174289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580174289L))
            info.setReturnValue(null);
    }


}
