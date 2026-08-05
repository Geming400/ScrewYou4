package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipePropertySet.class)
public class RecipePropertySet_529546799Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void test__716067400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-716067400L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/Collection;)Lnet/minecraft/world/item/crafting/RecipePropertySet;", cancellable = true)
    private static void create_2134269570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134269570L))
            info.setReturnValue(null);
    }


}
