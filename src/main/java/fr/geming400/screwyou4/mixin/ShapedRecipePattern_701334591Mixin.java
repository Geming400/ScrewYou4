package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShapedRecipePattern.class)
public class ShapedRecipePattern_701334591Mixin {
        @Inject(at = @At("HEAD"), method = "of(Ljava/util/Map;[Ljava/lang/String;)Lnet/minecraft/world/item/crafting/ShapedRecipePattern;", cancellable = true)
    private static void of__1657946688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657946688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/Map;Ljava/util/List;)Lnet/minecraft/world/item/crafting/ShapedRecipePattern;", cancellable = true)
    private static void of_78427776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(78427776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;)Z", cancellable = true)
    private void matches__405617991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405617991L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__938813410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938813410L))
            info.setReturnValue(-699837261);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__384013987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-384013987L))
            info.setReturnValue(-281149730);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients__1114683856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114683856L))
            info.setReturnValue(null);
    }


}
