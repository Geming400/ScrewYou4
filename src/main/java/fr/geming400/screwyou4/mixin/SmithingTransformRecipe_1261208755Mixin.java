package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SmithingTransformRecipe.class)
public class SmithingTransformRecipe_1261208755Mixin {
        @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1407421726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407421726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "additionIngredient()Ljava/util/Optional;", cancellable = true)
    private void additionIngredient_1506670176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506670176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseIngredient()Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private void baseIngredient_763769581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763769581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "templateIngredient()Ljava/util/Optional;", cancellable = true)
    private void templateIngredient_1506670176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506670176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_704776798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704776798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/SmithingRecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1402524646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402524646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1364971865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364971865L))
            info.setReturnValue(null);
    }


}
