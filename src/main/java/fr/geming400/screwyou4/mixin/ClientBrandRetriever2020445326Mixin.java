package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ClientBrandRetriever.class)
public class ClientBrandRetriever2020445326Mixin {
        @Inject(at = @At("HEAD"), method = "getClientModName()Ljava/lang/String;", cancellable = true)
    private static void getClientModName__1781064005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781064005L))
            info.setReturnValue("c\u7DB6@cGKINE62\u04F4CEV0MV:\u6A32\u83B0\u8F4BP*4zH6n? e\u028ErZE q&{6.:\u0F02>PdJz(h&;bZPkt@RF]OF6v2\u3127)\u5A00u;y`bpq8(:<YDkV");
    }


}
