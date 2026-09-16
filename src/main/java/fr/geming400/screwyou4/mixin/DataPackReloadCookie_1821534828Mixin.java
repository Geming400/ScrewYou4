package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.DataPackReloadCookie.class)
public class DataPackReloadCookie_1821534828Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_912908559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912908559L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1703008944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1703008944L))
            info.setReturnValue("7&d;gxQ<f\u96C2;\u018FJ\uBC4Cs%:W;He>@dv7\u71CFRJjIm*tX;\u0205ed])[Q_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1916080378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916080378L))
            info.setReturnValue(-1165059220);
    }

    @Inject(at = @At("HEAD"), method = "worldGenSettings()Lnet/minecraft/world/level/levelgen/WorldGenSettings;", cancellable = true)
    private void worldGenSettings__1851639674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851639674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void dataConfiguration_811949199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811949199L))
            info.setReturnValue(null);
    }


}
