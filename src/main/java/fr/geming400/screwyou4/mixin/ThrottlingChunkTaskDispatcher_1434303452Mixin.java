package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ThrottlingChunkTaskDispatcher.class)
public class ThrottlingChunkTaskDispatcher_1434303452Mixin {
        @Inject(at = @At("HEAD"), method = "getDebugStatus()Ljava/lang/String;", cancellable = true)
    private void getDebugStatus_1533402387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533402387L))
            info.setReturnValue("jfW(");
    }


}
