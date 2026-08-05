package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShapedRecipePattern.class)
public class ShapedRecipePattern_701334591Mixin {
        @Inject(at = @At("HEAD"), method = "of(Ljava/util/Map;[Ljava/lang/String;)Lnet/minecraft/world/item/crafting/ShapedRecipePattern;", cancellable = true)
    private static void of_1612927031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612927031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/Map;Ljava/util/List;)Lnet/minecraft/world/item/crafting/ShapedRecipePattern;", cancellable = true)
    private static void of_1845628777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845628777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;)Z", cancellable = true)
    private void matches__624427578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624427578L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_739596836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739596836L))
            info.setReturnValue(-1179899614);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients__1967295890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967295890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_739596836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739596836L))
            info.setReturnValue(-1179899614);
    }


}
