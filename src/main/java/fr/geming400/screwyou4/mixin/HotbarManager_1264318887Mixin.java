package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.HotbarManager.class)
public class HotbarManager_1264318887Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/client/player/inventory/Hotbar;", cancellable = true)
    private void get__1946292818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946292818L))
            info.setReturnValue(new net.minecraft.client.player.inventory.Hotbar());
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1395434748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1395434748L))
            info.cancel();
    }


}
