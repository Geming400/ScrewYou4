package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.packs.VanillaRecipeProvider.Runner.class)
public class Runner_214760846Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1674086057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674086057L))
            info.setReturnValue("%/\uA198$j7Cz<p\uD127Mq,^9U/#mhBUKYxq4XqCb2G A>z,v!|O!uwyO\u65696");
    }


}
