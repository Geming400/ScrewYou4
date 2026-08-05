package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeSerializers.class)
public class RecipeSerializers1427799973Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Ljava/lang/Object;", cancellable = true)
    private static void bootstrap_2034589420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2034589420L))
            info.setReturnValue(new java.lang.Object());
    }


}
