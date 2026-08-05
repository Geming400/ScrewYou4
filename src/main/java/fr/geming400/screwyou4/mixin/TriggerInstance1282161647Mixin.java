package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ItemDurabilityTrigger.TriggerInstance.class)
public class TriggerInstance1282161647Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1627293390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627293390L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_146701672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146701672L))
            info.setReturnValue("{\u449EARjdT`e|f8b}+\uAB5CMpOP<q:b{6b\"\uAAB4?@|4*AsYsXlNVl\uFCC2&?\"mJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1320424389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320424389L))
            info.setReturnValue(917143825);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;I)Z", cancellable = true)
    private void matches__754539366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754539366L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "delta()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void delta_1130926589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130926589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_1527623069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527623069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1527623069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527623069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "durability()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void durability_1130926589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130926589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDurability(Ljava/util/Optional;Ljava/util/Optional;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDurability__1339411815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339411815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDurability(Ljava/util/Optional;Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDurability_1253195560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253195560L))
            info.setReturnValue(null);
    }


}
