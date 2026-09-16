package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.ShapedCraftingRecipeDisplay.class)
public class ShapedCraftingRecipeDisplay1370910673Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_1473839040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473839040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_462284405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462284405L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2141334198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141334198L))
            info.setReturnValue("oa&\u9E1F\u5DCDF\u275F8uENj^J=Z5c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1928262764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928262764L))
            info.setReturnValue(-216322542);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result__2037991741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037991741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_129011108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129011108L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__269237327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269237327L))
            info.setReturnValue(-283299026);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_285562096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285562096L))
            info.setReturnValue(759687630);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients__445107773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445107773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation__1027135314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027135314L))
            info.setReturnValue(null);
    }


}
