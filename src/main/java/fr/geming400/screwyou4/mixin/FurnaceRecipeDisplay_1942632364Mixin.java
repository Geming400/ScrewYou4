package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.FurnaceRecipeDisplay.class)
public class FurnaceRecipeDisplay_1942632364Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_2045560730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045560730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1034006095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034006095L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1581911408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581911408L))
            info.setReturnValue("@rj>:S#8D\u9512I`)zX(rr^K/%*t2bPZn[[>#1,\uAA03\uB25Ar*mmFBnVA);2\u9F00\"rL0e\"Q\uA78A6CTf;Q+$}\u0502XrfMqY|.%!:irik7,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1794982842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794982842L))
            info.setReturnValue(1688757235);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result__1466270051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466270051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_700732798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700732798L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_2030247037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030247037L))
            info.setReturnValue(-137821337);
    }

    @Inject(at = @At("HEAD"), method = "experience()F", cancellable = true)
    private void experience__283313372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283313372L))
            info.setReturnValue(3.037268E8F);
    }

    @Inject(at = @At("HEAD"), method = "fuel()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void fuel__2056187548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056187548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ingredient()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void ingredient__895273879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895273879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation__455413624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455413624L))
            info.setReturnValue(null);
    }


}
