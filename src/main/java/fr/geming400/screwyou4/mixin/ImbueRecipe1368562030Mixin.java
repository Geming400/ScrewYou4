package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ImbueRecipe.class)
public class ImbueRecipe1368562030Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__856827305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856827305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1258221725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258221725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1300068450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300068450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_812130074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812130074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1472325141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472325141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1891821535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891821535L))
            info.setReturnValue(null);
    }


}
