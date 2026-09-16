package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.MapTextureManager.class)
public class MapTextureManager_1221587744Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void update_1405989404(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405989404L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__892987686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-892987686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareMapTexture(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void prepareMapTexture__650124545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650124545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetData()V", cancellable = true)
    private void resetData_976539609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(976539609L))
            info.cancel();
    }


}
