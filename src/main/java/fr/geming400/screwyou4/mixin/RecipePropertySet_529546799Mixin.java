package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipePropertySet.class)
public class RecipePropertySet_529546799Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void test__2030885366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2030885366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/Collection;)Lnet/minecraft/world/item/crafting/RecipePropertySet;", cancellable = true)
    private static void create_1106753278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106753278L))
            info.setReturnValue(null);
    }


}
