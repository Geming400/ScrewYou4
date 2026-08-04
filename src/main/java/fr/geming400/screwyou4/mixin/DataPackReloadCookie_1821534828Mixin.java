package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.DataPackReloadCookie.class)
public class DataPackReloadCookie_1821534828Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1087920210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087920210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_686074852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686074852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1859797569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859797569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldGenSettings()Lnet/minecraft/world/level/levelgen/WorldGenSettings;", cancellable = true)
    private void worldGenSettings__1203533305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203533305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void dataConfiguration__1556206557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1556206557L))
            info.setReturnValue(null);
    }


}
