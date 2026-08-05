package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeCache.class)
public class RecipeCache_1570412538Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/crafting/CraftingInput;)Ljava/util/Optional;", cancellable = true)
    private void get_910484209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910484209L))
            info.setReturnValue(null);
    }


}
