package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageException.class)
public class LevelStorageException793058666Mixin {
        @Inject(at = @At("HEAD"), method = "getMessageComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getMessageComponent__1383850499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383850499L))
            info.setReturnValue(null);
    }


}
