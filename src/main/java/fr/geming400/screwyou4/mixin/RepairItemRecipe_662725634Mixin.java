package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RepairItemRecipe.class)
public class RepairItemRecipe_662725634Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1562663702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1562663702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void matches__1964058122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1964058122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_106293677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106293677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1697309364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697309364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble(Lnet/minecraft/world/item/crafting/RecipeInput;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_766488744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766488744L))
            info.setReturnValue(null);
    }


}
