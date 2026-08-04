package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.RecipeBookType.class)
public class RecipeBookType_1877341165Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/inventory/RecipeBookType;", cancellable = true)
    private static void values__11025130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11025130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/inventory/RecipeBookType;", cancellable = true)
    private static void valueOf__1459433261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459433261L))
            info.setReturnValue(null);
    }


}
