package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.ItemCost.class)
public class ItemCost1690312022Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_781685754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781685754L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1834231749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834231749L))
            info.setReturnValue("9Z\u25ABYf>WDf0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2047303183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2047303183L))
            info.setReturnValue(-352550896);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void test_444697824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444697824L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_602141581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602141581L))
            info.setReturnValue(1021373403);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item_1158019039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158019039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void components__274596483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274596483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void itemStack__898888785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898888785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withComponents(Ljava/util/function/UnaryOperator;)Lnet/minecraft/world/item/trading/ItemCost;", cancellable = true)
    private void withComponents_79944184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79944184L))
            info.setReturnValue(null);
    }


}
