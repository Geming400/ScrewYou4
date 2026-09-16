package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.InventoryChangeTrigger.TriggerInstance.class)
public class TriggerInstance_2085396397Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1176770128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176770128L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1439147375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439147375L))
            info.setReturnValue("\uA077m /s{Vaa\u13B3>\u054C ?)\u0F01\uFA5F\u8BFDu3W%\u5093]t2%.\u8F6E:cY=B_<8\uD1A3<4+7LqG(*$&^\u48FC}fO4m\uD1EA$\uA811");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1652218809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652218809L))
            info.setReturnValue(-1890584779);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/item/ItemStack;III)Z", cancellable = true)
    private void matches_1849989366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849989366L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/advancements/triggers/InventoryChangeTrigger$TriggerInstance$Slots;", cancellable = true)
    private void slots__1309080579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309080579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items_2063144348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063144348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasItems([Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void hasItems_1817116685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817116685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasItems([Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void hasItems_1237291273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237291273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasItems([Lnet/minecraft/advancements/predicates/ItemPredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void hasItems_910195520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910195520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_854743355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854743355L))
            info.setReturnValue(null);
    }


}
