package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ImbueRecipe.class)
public class ImbueRecipe1368562030Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__715704572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-715704572L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches_1216738512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216738512L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1265259680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265259680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1418736637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1418736637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1358349681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1358349681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_1933448354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933448354L))
            info.setReturnValue(null);
    }


}
