package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.PartNames.class)
public class PartNames1681726567Mixin {
        @Inject(at = @At("HEAD"), method = "tentacle(I)Ljava/lang/String;", cancellable = true)
    private static void tentacle_1274195901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274195901L))
            info.setReturnValue("sBd*\u5DF7\u8C81CyMOj;F\u470AZ|414(Nn}h*Wf6unwN#Z\uAFE8\u886D/1\"7 EQH(*v*17nC\u19A0H3Tm\u04703iGcc?2[ {yxW^\u775C+J\uD2FA!\u3880$2\u9879");
    }


}
