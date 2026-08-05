package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeMap.class)
public class RecipeMap_1002338272Mixin {
        @Inject(at = @At("HEAD"), method = "values()Ljava/util/Collection;", cancellable = true)
    private void values_1850997489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1850997489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Iterable;)Lnet/minecraft/world/item/crafting/RecipeMap;", cancellable = true)
    private static void create_2085596764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085596764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byKey(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/crafting/RecipeHolder;", cancellable = true)
    private void byKey_1587078949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587078949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byType(Lnet/minecraft/world/item/crafting/RecipeType;)Ljava/util/Collection;", cancellable = true)
    private void byType__1146883941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146883941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipesFor(Lnet/minecraft/world/item/crafting/RecipeType;Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Ljava/util/stream/Stream;", cancellable = true)
    private void getRecipesFor_548157105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548157105L))
            info.setReturnValue(null);
    }


}
