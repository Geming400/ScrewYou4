package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.structures.SnbtDatafixer.class)
public class SnbtDatafixer_1405583747Mixin {
        @Inject(at = @At("HEAD"), method = "main([Ljava/lang/String;)V", cancellable = true)
    private static void main__1875727685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1875727685L))
            info.cancel();
    }


}
