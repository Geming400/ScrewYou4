package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.TransmuteRecipe.class)
public class TransmuteRecipe_1202016287Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1424767469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424767469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1023373049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023373049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display__1466614194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466614194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_645584330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645584330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__2058367279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2058367279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1305779397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1305779397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithOriginalComponents(Lnet/minecraft/world/item/ItemStackTemplate;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createWithOriginalComponents__1349685558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349685558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithOriginalComponents(Lnet/minecraft/world/item/ItemStackTemplate;Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createWithOriginalComponents_1756471953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756471953L))
            info.setReturnValue(null);
    }


}
