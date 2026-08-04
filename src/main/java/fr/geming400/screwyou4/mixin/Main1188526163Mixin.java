package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.Main.class)
public class Main1188526163Mixin {
        @Inject(at = @At("HEAD"), method = "main([Ljava/lang/String;)V", cancellable = true)
    private static void main__1280903469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1280903469L))
            info.cancel();
    }


}
