package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.Main.class)
public class Main1725807227Mixin {
        @Inject(at = @At("HEAD"), method = "main([Ljava/lang/String;)V", cancellable = true)
    private static void main__743622405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-743622405L))
            info.cancel();
    }


}
