package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.ShapelessCraftingRecipeDisplay.class)
public class ShapelessCraftingRecipeDisplay_108081456Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_333899876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333899876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1493593714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493593714L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1027378520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027378520L))
            info.setReturnValue("#\u372EKcu#^gy#_7Rj{JK:BA!\"YE\u24E8@uKjBK\u9FFD#@o\u3D3A@i,/\u6B84\uD40FP2u;*M{0{I>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_146344197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146344197L))
            info.setReturnValue(1131695122);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result_845035102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845035102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled__1321687925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321687925L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients_1734418271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734418271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation_845035102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845035102L))
            info.setReturnValue(null);
    }


}
