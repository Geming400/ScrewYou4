package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.BannerDuplicateRecipe.class)
public class BannerDuplicateRecipe_962892897Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1663890859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1663890859L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1262496439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1262496439L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_406460940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406460940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1997476627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997476627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1066656007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1066656007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemainingItems(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getRemainingItems__959794009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959794009L))
            info.setReturnValue(null);
    }


}
