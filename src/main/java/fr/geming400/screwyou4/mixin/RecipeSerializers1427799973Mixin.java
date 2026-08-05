package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.RecipeSerializers.class)
public class RecipeSerializers1427799973Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Ljava/lang/Object;", cancellable = true)
    private static void bootstrap_1396676634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396676634L))
            info.setReturnValue(new java.lang.Object());
    }


}
