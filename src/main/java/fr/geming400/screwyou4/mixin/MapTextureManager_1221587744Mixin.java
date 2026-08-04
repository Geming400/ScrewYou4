package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.MapTextureManager.class)
public class MapTextureManager_1221587744Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void update_533616467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(533616467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1259862482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1259862482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetData()V", cancellable = true)
    private void resetData_1259862482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1259862482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareMapTexture(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void prepareMapTexture_34709829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34709829L))
            info.setReturnValue(null);
    }


}
