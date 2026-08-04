package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ChargedProjectiles.class)
public class ChargedProjectiles_640937736Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2026449994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026449994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__494522240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494522240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_679200477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679200477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/item/ItemStackTemplate;)Lnet/minecraft/world/item/component/ChargedProjectiles;", cancellable = true)
    private static void of__908297513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908297513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_679216318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679216318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/item/Item;)Z", cancellable = true)
    private void contains__2123142633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123142633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items__2027692745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027692745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopies()Ljava/util/List;", cancellable = true)
    private void itemCopies__2027692745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027692745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofNonEmpty(Ljava/util/List;)Lnet/minecraft/world/item/component/ChargedProjectiles;", cancellable = true)
    private static void ofNonEmpty_1763269949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763269949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1901780655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1901780655L))
            info.cancel();
    }


}
