package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.BuildContexts.class)
public class BuildContexts2133309316Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1391234951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391234951L))
            info.setReturnValue("_s\u8427\u7A66\u515C`H-\u3E74>DV\uD1F6[aGMYd=w&us2\uCF3Aw:");
    }


}
