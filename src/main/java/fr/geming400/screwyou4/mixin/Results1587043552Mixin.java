package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionCompiler.Results.class)
public class Results1587043552Mixin {
        @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release__431347732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-431347732L))
            info.cancel();
    }


}
