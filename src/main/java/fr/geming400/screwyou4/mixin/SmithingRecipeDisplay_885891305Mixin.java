package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SmithingRecipeDisplay.class)
public class SmithingRecipeDisplay_885891305Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void base_1622844951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622844951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_1111709725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111709725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2023563733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023563733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__249568671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249568671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_924154046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924154046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result_1622844951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622844951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void template_1622844951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622844951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation_1622844951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622844951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addition()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void addition_1622844951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622844951L))
            info.setReturnValue(null);
    }


}
