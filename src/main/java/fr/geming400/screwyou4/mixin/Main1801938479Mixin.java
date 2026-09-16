package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.Main.class)
public class Main1801938479Mixin {
        @Inject(at = @At("HEAD"), method = "main([Ljava/lang/String;)V", cancellable = true)
    private static void main__1479372952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1479372952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addServerConverters(Lnet/minecraft/data/DataGenerator;Ljava/util/Collection;ZZ)V", cancellable = true)
    private static void addServerConverters_540460299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(540460299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addServerDefinitionProviders(Lnet/minecraft/data/DataGenerator;ZZ)V", cancellable = true)
    private static void addServerDefinitionProviders_646071974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646071974L))
            info.cancel();
    }


}
