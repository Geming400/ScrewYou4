package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.gui.PlayerListComponent.class)
public class PlayerListComponent1032803504Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_903119846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(903119846L))
            info.cancel();
    }


}
