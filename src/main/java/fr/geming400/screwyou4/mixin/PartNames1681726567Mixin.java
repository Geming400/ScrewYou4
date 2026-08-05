package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.PartNames.class)
public class PartNames1681726567Mixin {
        @Inject(at = @At("HEAD"), method = "tentacle(I)Ljava/lang/String;", cancellable = true)
    private static void tentacle_260857231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(260857231L))
            info.setReturnValue("h\u776B/KpS\u69B4\uC260#3jCV*.k \uA626&s^Zo\uAAE6>6df1\u39C2nFznO\u484F>3Yv]fSJWYH=jk\u7BBB)>\uC779/\uCB88dviy(;=[e6\u6B5Ay|^");
    }


}
