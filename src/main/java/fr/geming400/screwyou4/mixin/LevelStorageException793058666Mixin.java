package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageException.class)
public class LevelStorageException793058666Mixin {
        @Inject(at = @At("HEAD"), method = "getMessageComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getMessageComponent__1754733783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754733783L))
            info.setReturnValue(null);
    }


}
