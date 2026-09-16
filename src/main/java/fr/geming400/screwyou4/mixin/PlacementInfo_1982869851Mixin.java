package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.PlacementInfo.class)
public class PlacementInfo_1982869851Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/item/crafting/Ingredient;)Lnet/minecraft/world/item/crafting/PlacementInfo;", cancellable = true)
    private static void create__1519787803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519787803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/List;)Lnet/minecraft/world/item/crafting/PlacementInfo;", cancellable = true)
    private static void create__1559808294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559808294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromOptionals(Ljava/util/List;)Lnet/minecraft/world/item/crafting/PlacementInfo;", cancellable = true)
    private static void createFromOptionals__1308557943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1308557943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients_166851404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166851404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsToIngredientIndex()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void slotsToIngredientIndex__283527422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283527422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isImpossibleToPlace()Z", cancellable = true)
    private void isImpossibleToPlace__1254386620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254386620L))
            info.setReturnValue(false);
    }


}
