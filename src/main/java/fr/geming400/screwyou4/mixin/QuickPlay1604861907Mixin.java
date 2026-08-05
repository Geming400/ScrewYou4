package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.quickplay.QuickPlay.class)
public class QuickPlay1604861907Mixin {
        @Inject(at = @At("HEAD"), method = "connect(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/main/GameConfig$QuickPlayVariant;Lcom/mojang/realmsclient/client/RealmsClient;)V", cancellable = true)
    private static void connect__1896329166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1896329166L))
            info.cancel();
    }


}
