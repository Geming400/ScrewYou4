package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapItemSavedData.MapPatch.class)
public class MapPatch1023846712Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1885608325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885608325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__111613263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111613263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1062109454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062109454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1062108958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062108958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyToMap(Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void applyToMap_967740290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(967740290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startY()I", cancellable = true)
    private void startY_1062108958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062108958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1062108958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062108958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startX()I", cancellable = true)
    private void startX_1062108958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062108958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapColors()[B", cancellable = true)
    private void mapColors__2085285954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085285954L))
            info.setReturnValue(null);
    }


}
