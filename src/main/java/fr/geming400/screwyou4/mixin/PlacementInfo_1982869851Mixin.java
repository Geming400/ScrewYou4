package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.PlacementInfo.class)
public class PlacementInfo_1982869851Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/item/crafting/Ingredient;)Lnet/minecraft/world/item/crafting/PlacementInfo;", cancellable = true)
    private static void create_740696929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740696929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/List;)Lnet/minecraft/world/item/crafting/PlacementInfo;", cancellable = true)
    private static void create__1710638506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710638506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isImpossibleToPlace()Z", cancellable = true)
    private void isImpossibleToPlace_2021148433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021148433L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients__685760630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-685760630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsToIngredientIndex()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void slotsToIngredientIndex__1381606351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1381606351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromOptionals(Ljava/util/List;)Lnet/minecraft/world/item/crafting/PlacementInfo;", cancellable = true)
    private static void createFromOptionals__1710638506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710638506L))
            info.setReturnValue(null);
    }


}
