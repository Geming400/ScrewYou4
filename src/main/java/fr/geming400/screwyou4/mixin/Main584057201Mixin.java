package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.Main.class)
public class Main584057201Mixin {
        @Inject(at = @At("HEAD"), method = "main([Ljava/lang/String;)V", cancellable = true)
    private static void main__1885372431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1885372431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addClientProviders(Lnet/minecraft/data/DataGenerator;Z)V", cancellable = true)
    private static void addClientProviders_1550931055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1550931055L))
            info.cancel();
    }


}
