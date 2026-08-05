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
            info.setReturnValue("h睫/KpS榴쉠#3jCV*.k ꘦&s^Zoꫦ>6df1㧂nFznO䡏>3Yv]fSJWYH=jk箻)>읹/쮈dviy(;=[e6歚y|^");
    }


}
