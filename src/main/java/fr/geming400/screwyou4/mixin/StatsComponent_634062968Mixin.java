package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.gui.StatsComponent.class)
public class StatsComponent_634062968Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1480512462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1480512462L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "paint(Ljava/awt/Graphics;)V", cancellable = true)
    private void paint__520006026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-520006026L))
            info.cancel();
    }


}
