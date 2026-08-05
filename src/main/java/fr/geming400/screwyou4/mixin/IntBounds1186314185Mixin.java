package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.BlockUtil.IntBounds.class)
public class IntBounds1186314185Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_50853714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50853714L))
            info.setReturnValue("\u199C\uAD39,\u2421|`\uB468m\u9757\uCEEBfY");
    }


}
