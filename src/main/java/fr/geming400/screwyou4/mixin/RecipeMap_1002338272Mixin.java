package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeMap.class)
public class RecipeMap_1002338272Mixin {
        @Inject(at = @At("HEAD"), method = "values()Ljava/util/Collection;", cancellable = true)
    private void values__811310001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811310001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Iterable;)Lnet/minecraft/world/item/crafting/RecipeMap;", cancellable = true)
    private static void create_1934766552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934766552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byKey(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/crafting/RecipeHolder;", cancellable = true)
    private void byKey__384113491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-384113491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byType(Lnet/minecraft/world/item/crafting/RecipeType;)Ljava/util/Collection;", cancellable = true)
    private void byType__1854100118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854100118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipesFor(Lnet/minecraft/world/item/crafting/RecipeType;Lnet/minecraft/world/item/crafting/RecipeInput;Lnet/minecraft/world/level/Level;)Ljava/util/stream/Stream;", cancellable = true)
    private void getRecipesFor__350625589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350625589L))
            info.setReturnValue(null);
    }


}
