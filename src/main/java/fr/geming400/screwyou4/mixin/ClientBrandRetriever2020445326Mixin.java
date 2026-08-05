package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ClientBrandRetriever.class)
public class ClientBrandRetriever2020445326Mixin {
        @Inject(at = @At("HEAD"), method = "getClientModName()Ljava/lang/String;", cancellable = true)
    private static void getClientModName_884985103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884985103L))
            info.setReturnValue("K`@O-?-kᘰPPfKmD[)@oFw 䛎GM┬voQ}VgqR\"3,GCE6M.");
    }


}
