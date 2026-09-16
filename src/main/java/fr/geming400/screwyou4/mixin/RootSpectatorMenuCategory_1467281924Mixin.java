package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.spectator.RootSpectatorMenuCategory.class)
public class RootSpectatorMenuCategory_1467281924Mixin {
        @Inject(at = @At("HEAD"), method = "getPrompt()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPrompt__284533136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284533136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems_665257277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665257277L))
            info.setReturnValue(null);
    }


}
