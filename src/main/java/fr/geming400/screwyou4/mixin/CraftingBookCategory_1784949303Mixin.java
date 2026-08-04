package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CraftingBookCategory.class)
public class CraftingBookCategory_1784949303Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/crafting/CraftingBookCategory;", cancellable = true)
    private static void values_871966666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871966666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/crafting/CraftingBookCategory;", cancellable = true)
    private static void valueOf__999658681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999658681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_649488831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649488831L))
            info.setReturnValue(null);
    }


}
