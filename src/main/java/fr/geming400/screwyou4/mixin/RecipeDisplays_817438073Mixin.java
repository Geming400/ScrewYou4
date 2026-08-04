package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.RecipeDisplays.class)
public class RecipeDisplays_817438073Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private static void bootstrap_1314462855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314462855L))
            info.setReturnValue(null);
    }


}
