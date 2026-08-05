package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.packs.VanillaRecipeProvider.class)
public class VanillaRecipeProvider_1910627668Mixin {
        @Inject(at = @At("HEAD"), method = "smithingTrims()Ljava/util/stream/Stream;", cancellable = true)
    private static void smithingTrims_2121212206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121212206L))
            info.setReturnValue(null);
    }


}
