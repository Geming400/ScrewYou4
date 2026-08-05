package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.StonecutterRecipe.class)
public class StonecutterRecipe24549156Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/lang/String;", cancellable = true)
    private void group__1110911315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110911315L))
            info.setReturnValue("kBY|-`qW1?g\"35V7Qy+᳸k%wRF:m) ０k휘|/}C6W༷a H5⪏jK");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType__1456846360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456846360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display_1650885972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650885972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resultDisplay()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void resultDisplay_761502803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761502803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer__531882800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-531882800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory__307318277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307318277L))
            info.setReturnValue(null);
    }


}
