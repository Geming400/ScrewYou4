package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.Main.class)
public class Main584057201Mixin {
        @Inject(at = @At("HEAD"), method = "main([Ljava/lang/String;)V", cancellable = true)
    private static void main_1597713066(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1597713066L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addClientProviders(Lnet/minecraft/data/DataGenerator;Z)V", cancellable = true)
    private static void addClientProviders__963041115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-963041115L))
            info.cancel();
    }


}
