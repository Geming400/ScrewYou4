package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.packs.VanillaRecipeProvider.Runner.class)
public class Runner_214760846Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__920699626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-920699626L))
            info.setReturnValue("r\u7016\uB0FEBYSI\u41690G\u7867R");
    }


}
