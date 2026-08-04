package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.RootSpectatorMenuCategory.class)
public class RootSpectatorMenuCategory_1467281924Mixin {
        @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems__1201348557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201348557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrompt()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrompt__709627242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709627242L))
            info.setReturnValue(null);
    }


}
