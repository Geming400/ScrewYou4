package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmithingTransformRecipe.class)
public class SmithingTransformRecipe_1261208755Mixin {
        @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1372612956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372612956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "templateIngredient()Ljava/util/Optional;", cancellable = true)
    private void templateIngredient_264695627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264695627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "additionIngredient()Ljava/util/Optional;", cancellable = true)
    private void additionIngredient_1741012301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741012301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseIngredient()Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private void baseIngredient__1343401489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343401489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/SmithingRecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_301941768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301941768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1526089913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1526089913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1826095078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1826095078L))
            info.setReturnValue(null);
    }


}
