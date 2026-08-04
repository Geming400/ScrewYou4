package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.ShapedCraftingRecipeDisplay.class)
public class ShapedCraftingRecipeDisplay1370910673Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_1596729094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596729094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1538544364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538544364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_235450698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235450698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1409173415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409173415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result_2107864320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107864320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled__58858707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-58858707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1409172919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409172919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients__1297719807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297719807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation_2107864320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107864320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1409172919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409172919L))
            info.setReturnValue(null);
    }


}
