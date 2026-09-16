package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.ShapelessCraftingRecipeDisplay.class)
public class ShapelessCraftingRecipeDisplay_108081456Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_211009822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211009822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__800544813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800544813L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_878504980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878504980L))
            info.setReturnValue("hI?-!<i\u3709 M\u4601p\uAFDFpKG0,ZC56]\uD65B,@m\u6ED5\uC5ED2hIONKi3l&)\uC409OYiju5ZR\"yKQ \uC79AC%GP\u3AB3=pW(=eV8&Ge^w/W|^R\u1F90");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_665433546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665433546L))
            info.setReturnValue(-263122504);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result_994146337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994146337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled__1133818110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133818110L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation_2005002764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2005002764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients__1707936991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707936991L))
            info.setReturnValue(null);
    }


}
