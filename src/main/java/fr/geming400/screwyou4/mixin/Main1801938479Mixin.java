package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.Main.class)
public class Main1801938479Mixin {
        @Inject(at = @At("HEAD"), method = "main([Ljava/lang/String;)V", cancellable = true)
    private static void main__667491153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-667491153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addServerConverters(Lnet/minecraft/data/DataGenerator;Ljava/util/Collection;ZZ)V", cancellable = true)
    private static void addServerConverters__1175312094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1175312094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addServerDefinitionProviders(Lnet/minecraft/data/DataGenerator;ZZ)V", cancellable = true)
    private static void addServerDefinitionProviders_1753349361(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1753349361L))
            info.cancel();
    }


}
