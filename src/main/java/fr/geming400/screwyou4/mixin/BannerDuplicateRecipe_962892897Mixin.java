package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.BannerDuplicateRecipe.class)
public class BannerDuplicateRecipe_962892897Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_811069378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811069378L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1121373706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121373706L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRemainingItems(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getRemainingItems__2535353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2535353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1764018815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764018815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1824405771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824405771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1527779220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527779220L))
            info.setReturnValue(null);
    }


}
