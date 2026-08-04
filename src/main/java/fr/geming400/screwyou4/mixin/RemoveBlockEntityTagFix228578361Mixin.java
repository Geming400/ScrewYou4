package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.RemoveBlockEntityTagFix.class)
public class RemoveBlockEntityTagFix228578361Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1713774196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713774196L))
            info.setReturnValue(null);
    }


}
